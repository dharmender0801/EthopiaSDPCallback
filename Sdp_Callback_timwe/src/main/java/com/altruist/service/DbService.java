package com.altruist.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.altruist.model.BillingSuccess;
import com.altruist.model.TblBillingLogs;
import com.altruist.model.TblChatID;
import com.altruist.model.TblProduct;
import com.altruist.model.TblVoicechat;
import com.altruist.model.TblVoicechatUnsub;
import com.altruist.repo.BillingSuccessRepo;
import com.altruist.repo.TblBillingLogsRepo;
import com.altruist.repo.TblChatIDRepo;
import com.altruist.repo.TblVoicechatRepo;
import com.altruist.repo.TblWapCountRepo;
import com.altruist.repo.UnsubRepoo;
import com.altruist.response.ResponseParamSDP;

@Service
public class DbService {

	@Value("${circleid}")
	private String circleid;
	@Value("${langid}")
	private String langid;
	@Value("${src}")
	private String src;

	@Autowired
	private TblWapCountRepo countRepo;

	@Autowired
	private TblChatIDRepo chatID;

	@Autowired
	private TblVoicechatRepo voicechatrepo;

	@Autowired
	private BillingSuccessRepo billingrepo;
	@Autowired
	private TblBillingLogsRepo billingLogsRepo;
	@Autowired
	private UnsubRepoo unsubRepoo;

	public TblVoicechat TblVCinsertion(ResponseParamSDP req_param, TblVoicechat voicechat, TblProduct productList) {
		// TODO Auto-generated method stub

		String vendor_id = countRepo.findTop1ByPkgnameAndMsisdnOrderByDateTimeAsc("chat", "233" + req_param.getMsisdn())
				.getCpid();
		TblChatID chat = chatID.findFirstByRecordstatus("0");
		if (chat != null) {

			chat.setRecordstatus("1");
			chatID.save(chat);
			TblVoicechat _newVoicechat = new TblVoicechat();
			_newVoicechat.setAni(req_param.getMsisdn());
			_newVoicechat.setGender("N");
			_newVoicechat.setCircleid(circleid);
			_newVoicechat.setDefault_amount(productList.getAmount());
			_newVoicechat.setLangid(langid);
			_newVoicechat.setUser_type(productList.getPack());
			_newVoicechat.setDnis("TIMWE");
			_newVoicechat.setSub_date_time(req_param.getChargingtime());
			_newVoicechat.setRecordstatus("1");
			_newVoicechat.setVoicechatid(chat.getChatid());
			_newVoicechat.setMact(req_param.getTypeevent().equalsIgnoreCase("SUB") ? req_param.getEntryChannel()
					: req_param.getEntryChannel() + "_REN");
			_newVoicechat.setSubscriptionid(req_param.getTransactionUUID());
			_newVoicechat.setRen_pack("PAID");
			_newVoicechat.setVendor_id(vendor_id);
			voicechatrepo.save(_newVoicechat);

		}
		return null;
	}

	public void dbHandler(ResponseParamSDP RespSDP, TblVoicechat _voicechatObj, TblProduct TblProduct) {
		// TODO Auto-generated method stub

		try {
			if (RespSDP.getRequesttype().equalsIgnoreCase("CHARGE")
					&& RespSDP.getMnoDeliveryCode().equalsIgnoreCase("DELIVERED")) {
				successInsertion(RespSDP, _voicechatObj, TblProduct);
				voicechatUpdate(RespSDP, _voicechatObj, TblProduct);
				dbLogsDataSync(RespSDP, _voicechatObj, TblProduct);
			} else if (RespSDP.getRequesttype().equalsIgnoreCase("OPTIN")) {
				dbLogsDataSync(RespSDP, _voicechatObj, TblProduct);
			} else if (RespSDP.getRequesttype().equalsIgnoreCase("OPTOUT")) {
				DBVoicechatUnsub(RespSDP, _voicechatObj);
				voicechatDeleteDataSync(RespSDP.getMsisdn());
				dbLogsDataSync(RespSDP, _voicechatObj, TblProduct);
			} else {
				dbLogsDataSync(RespSDP, _voicechatObj, TblProduct);
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.exit(0);
		}

	}

	private void voicechatDeleteDataSync(String msisdn) {
		// TODO Auto-generated method stub
		voicechatrepo.deleteByAni(msisdn);

	}

	private void DBVoicechatUnsub(ResponseParamSDP respSDP, TblVoicechat Voicechat) {
		// TODO Auto-generated method stub
		TblVoicechatUnsub _unsub = new TblVoicechatUnsub();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		try {
			_unsub.setAni(respSDP.getMsisdn());
			_unsub.setGender(Voicechat.getGender());
			_unsub.setCircleid(Voicechat.getCircleid());
			_unsub.setLangid(Voicechat.getLangid());
			_unsub.setDnis(Voicechat.getDnis());
			_unsub.setUnsubdnis(Voicechat.getUnsubdnis());
			_unsub.setSub_date_time(Voicechat.getSub_date_time());
			_unsub.setUnsub_date_time(dateFormat.format(date));
			_unsub.setLast_billed_date(Voicechat.getLast_billed_date());
			_unsub.setNext_billed_date(Voicechat.getNext_billed_date());
			_unsub.setRecordstatus("2");
			_unsub.setUser_type(Voicechat.getUser_type());
			_unsub.setRecordprofile(Voicechat.getRecordprofile());
			_unsub.setPlanid(Voicechat.getPlanid());
			_unsub.setSubscriptionid(0);
			_unsub.setMact(Voicechat.getMact());
			_unsub.setMdact(Voicechat.getMdact());
			_unsub.setRen_pack(Voicechat.getRen_pack());
			_unsub.setDefault_amount(Voicechat.getDefault_amount());
			_unsub.setVoicechatid(Voicechat.getVoicechatid());
			unsubRepoo.save(_unsub);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void dbLogsDataSync(ResponseParamSDP resp, TblVoicechat Voicechat, TblProduct Product) {
		// TODO Auto-generated method stub
		TblBillingLogs tblLogs = new TblBillingLogs();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		try {
			tblLogs.setAni(resp.getMsisdn());
			tblLogs.setTotal_amount(Voicechat.getDefault_amount());
			tblLogs.setDeducted_amount(resp.getRequesttype().equalsIgnoreCase("CHARGE")
					? resp.getMnoDeliveryCode().equalsIgnoreCase("DELIVERED") ? Product.getPrice() : null
					: null);
			tblLogs.setDatetime(dateFormat.format(date));
			tblLogs.setErrordesc(resp.getMnoDeliveryCode());
			tblLogs.setType_event(resp.getTypeevent());
			tblLogs.setProcess_datetime(resp.getChargingtime());
			tblLogs.setTransactionid(resp.getTransactionUUID());
			tblLogs.setSubmode(Voicechat.getMact());
			tblLogs.setSrc(src);
			billingLogsRepo.save(tblLogs);
		} catch (Exception e) {

		}

	}

	private void voicechatUpdate(ResponseParamSDP respSDP, TblVoicechat _voicechatObj, TblProduct tblProduct) {
		// TODO Auto-generated method stub
		TblVoicechat vchat = voicechatrepo.findByAni(respSDP.getMsisdn());
		try {
			if (vchat != null) {

				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				Calendar cal = Calendar.getInstance();
				cal.setTime(dateFormat.parse(respSDP.getChargingtime()));
				cal.add(Calendar.DATE, tblProduct.getValidity());
				vchat.setNext_billed_date(dateFormat.format(cal.getTime()));
				vchat.setLast_billed_date(respSDP.getChargingtime());
				vchat.setDefault_amount(tblProduct.getPrice());
				voicechatrepo.save(vchat);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void successInsertion(ResponseParamSDP resp, TblVoicechat Voicechat, TblProduct Product) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, Product.getValidity());

		BillingSuccess tblsuccess = new BillingSuccess();
		tblsuccess.setAni(resp.getMsisdn());
		tblsuccess.setTotal_amount(Voicechat.getDefault_amount());
		tblsuccess.setDeducted_amount(Product.getPrice());
		tblsuccess.setProcess_datetime(resp.getChargingtime());
		tblsuccess.setErrordesc("SUCCESS");
		tblsuccess.setType_event(resp.getTypeevent());
		tblsuccess.setDatetime(dateFormat.format(date));
		tblsuccess.setSrc(src);
		tblsuccess.setIs_emm("0");
		tblsuccess.setSubmode(Voicechat.getMact());
		tblsuccess.setNext_billed_date(dateFormat.format(cal.getTime()));
		tblsuccess.setMode(resp.getEntryChannel());
		tblsuccess.setTransactionid(resp.getTransactionUUID());
		billingrepo.save(tblsuccess);
	}

}
