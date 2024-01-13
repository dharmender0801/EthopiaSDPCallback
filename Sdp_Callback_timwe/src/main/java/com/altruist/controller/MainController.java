package com.altruist.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.altruist.model.TblProduct;
import com.altruist.model.TblVoicechat;
import com.altruist.repo.BillingSuccessRepo;
import com.altruist.repo.TblProductRepo;
import com.altruist.repo.TblVoicechatRepo;
import com.altruist.response.ParseRequest;
import com.altruist.response.ResponseParamSDP;
import com.altruist.service.DbService;

import lombok.extern.slf4j.Slf4j;

@Component
public class MainController implements CommandLineRunner {
	@Value("${callbackpath}")
	private String Callback;
	@Value("${ErrorPath}")
	private String ErrorPath;
	File Erorfile = null;
	ResponseParamSDP _param = new ResponseParamSDP();
	ParseRequest _parse = new ParseRequest();
	TblProduct _productlist = new TblProduct();
	TblVoicechat voicechat = new TblVoicechat();
	int k = 1;
	public static Hashtable<String, TblProduct> productDetail = new Hashtable<String, TblProduct>();

	@Autowired
	private BillingSuccessRepo billingrepo;

	@Autowired
	private TblProductRepo product;

	@Autowired
	private TblVoicechatRepo voicechatrepo;

	@Autowired
	private DbService dbService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		while (true) {
			System.out.println("Going to fetch product");
			List<TblProduct> productList = product.findAll();
			productList.forEach(n -> {
				productDetail.put(n.getProduct_id(), n);
			});

			for (;;) {
				System.out.println("searching for files..........");
				File[] file = getFiles();
				if ((file == null) || (file.length <= 0)) {
					System.out.println("no files found....");
					try {
						System.out.println("sleeping.... will wake after 20 sec....");
						Thread.sleep(20000L);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					System.out.println("files found .. checking file.");
					checkFile(file);
				}
			}

		}
	}

	private void checkFile(File[] listOfFiles) {
		try {

			for (File file : listOfFiles) {

				String filename = file.getName();
				int extensionIndex = filename.lastIndexOf(".");
				filename = filename.substring(0, extensionIndex);
				File xmlfile = new File(Callback + filename + ".xml");
				System.out.println("[xml file name:" + filename + "]");

				Erorfile = xmlfile;

				if ((filename.equalsIgnoreCase("")) || (filename.equalsIgnoreCase(" "))) {
					System.out.println("deleting the file as its name is blank.");
					xmlfile.delete();
				}

				if ((file.isFile()) && (xmlfile.exists())) {

					Reader fileReader = new FileReader(xmlfile);
					BufferedReader _bReader = new BufferedReader(fileReader);

					StringBuilder sb = new StringBuilder();
					String line = _bReader.readLine();
					while (line != null) {
						sb.append(line).append("\n");
						line = _bReader.readLine();
					}

					String xml2String = sb.toString();

					_param = _parse.XmlParser(xml2String);

					if (_param.getRequesttype().equalsIgnoreCase("CHARGE")) {
						Date date = null;

						try {
							date = new SimpleDateFormat("yyyy-MM-dd").parse(_param.getChargingtime());
						} catch (Exception e) {
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
							String date_new = sdf.format(new Date());
							try {
								date = new SimpleDateFormat("yyyy-MM-dd").parse(date_new);
							} catch (Exception e1) {
								e1.printStackTrace();
							}
						}

						long count = billingrepo.countByAniAndTransactionIdAndTypeEventAndProcessDatetime(
								_param.getMsisdn(), _param.getTransactionUUID(), _param.getTypeevent(), date);
//						boolean _successCheck = dbreq.checkCharging(_param);

						System.out.println("[msisdn:" + _param.getMsisdn() + "][charging status:" + count + "]");

						if (count < 0) {
							for (k = 1; k <= productDetail.size(); k++) {
								if (_param.getPricepointId()
										.equalsIgnoreCase(productDetail.get("" + k + "").getPriceid())) {
									_productlist = productDetail.get("" + k + "");
									break;
								}
							}

//							_voicechatList = dbImpl.pullDataFromVoicechat(_param);
							voicechat = voicechatrepo.findByAni(_param.getMsisdn());

							if (voicechat == null) {
								voicechat = dbService.TblVCinsertion(_param, voicechat, _productlist);
							}

							dbService.dbHandler(_param, voicechat, _productlist);
						} else {
							System.out.println("[msisdn:" + _param.getMsisdn()
									+ "][staus:number already exist in billing success.]");
						}
					} else if (_param.getRequesttype().equalsIgnoreCase("OPTIN")) {
						for (int k = 1; k <= productDetail.size(); k++) {
							if (_param.getPricepointId()
									.equalsIgnoreCase(productDetail.get("" + k + "").getPriceid())) {
								_productlist = productDetail.get("" + k + "");
								break;
							}
						}

						dbService.dbHandler(_param, voicechat, _productlist);
					} else if (_param.getRequesttype().equalsIgnoreCase("OPTOUT")) {
						voicechat = voicechatrepo.findByAni(_param.getMsisdn());

						if (voicechat == null) {
							voicechat = dbService.TblVCinsertion(_param, voicechat, _productlist);
						}

						dbService.dbHandler(_param, voicechat, _productlist);
					}

					System.out.println("in the process of deleting file......file name:" + filename);

					deleteFile(xmlfile);

				} else {
					System.out.println("file not found ....");
				}

				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private boolean deleteFile(File file) {
		return file.delete();
	}

	public void MoveFile(File FileName) {
		String ErorFilePath = ErrorPath;
		System.out.println("error file path-:" + ErorFilePath);

		if (FileName.renameTo(new File(ErorFilePath))) {
			FileName.delete();
			System.out.println("error file moved successfully..");
		} else {
			System.out.println("error to move the file");
		}
	}

	private File[] getFiles() {
		File[] listOfFiles = (File[]) null;
		try {
			File directory = new File(Callback);
			listOfFiles = directory.listFiles(new MyFileNameFilter(".xml"));

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (File file : listOfFiles)
			try {
				System.out.println(file.getCanonicalPath());
			} catch (Exception e) {
				e.printStackTrace();
			}
		return listOfFiles;
	}

	public static class MyFileNameFilter implements FilenameFilter {
		private String ext;

		public MyFileNameFilter(String ext) {
			this.ext = ext.toLowerCase();
		}

		public boolean accept(File dir, String name) {
			return name.toLowerCase().endsWith(ext);
		}
	}

	public void threadSleep(long seconds, String message) {
		try {
			System.out.println("[sleep for" + seconds + "][msg=" + message + "]");
			Thread.sleep(seconds);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
