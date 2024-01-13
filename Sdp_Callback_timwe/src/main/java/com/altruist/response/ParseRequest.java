package com.altruist.response;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseRequest {

	ResponseParamSDP _respObj = new ResponseParamSDP();

	public ResponseParamSDP XmlParser(String xml) {

		String userIdentifier = "";
		String pricepointId = "";
		String id = "";
		String entryChannel = "";
		String msisdn = "";
		String productId = "";
		String transactionUUID = "";
		String mnoDeliveryCode = "";
		String totalCharged = "";
		String mcc = "";
		String mnc = "";
		String largeAccount = "";
		String text = "";
		String chargingTime = "";
		String requestType = "";
		String typeEvent = "";

		Matcher matcher1 = Pattern.compile("<id>(.*?)</id>").matcher(xml);
		if (matcher1.find()) {
			id = matcher1.group(1);
			_respObj.setId(Integer.parseInt(id));
		}

		Matcher matcher2 = Pattern.compile("<productId>(.*?)</productId>").matcher(xml);
		if (matcher2.find()) {
			productId = matcher2.group(1);
			_respObj.setProductId(productId);
		}

		Matcher matcher3 = Pattern.compile("<pricepointId>(.*?)</pricepointId>").matcher(xml);
		if (matcher3.find()) {
			pricepointId = matcher3.group(1);
			_respObj.setPricepointId(pricepointId);
		}

		Matcher matcher4 = Pattern.compile("<msisdn>(.*?)</msisdn>").matcher(xml);
		if (matcher4.find()) {
			msisdn = matcher4.group(1);
			if (msisdn.length() == 12)
				msisdn = msisdn.substring(3, 12);

			_respObj.setMsisdn(msisdn);
		}

		Matcher matcher5 = Pattern.compile("<entryChannel>(.*?)</entryChannel>").matcher(xml);
		if (matcher5.find()) {
			entryChannel = matcher5.group(1);
			_respObj.setEntryChannel(entryChannel);
		}

		Matcher matcher6 = Pattern.compile("<transactionUUID>(.*?)</transactionUUID>").matcher(xml);
		if (matcher6.find()) {
			transactionUUID = matcher6.group(1);
			_respObj.setTransactionUUID(transactionUUID);
		}

		Matcher matcher7 = Pattern.compile("<userIdentifier>(.*?)</userIdentifier>").matcher(xml);
		if (matcher7.find()) {
			userIdentifier = matcher7.group(1);
			_respObj.setUserIdentifier(userIdentifier);
		}

		Matcher matcher8 = Pattern.compile("<largeAccount>(.*?)</largeAccount>").matcher(xml);
		if (matcher8.find()) {
			largeAccount = matcher8.group(1);
			_respObj.setUserIdentifier(largeAccount);
		}

		Matcher matcher9 = Pattern.compile("<mnoDeliveryCode>(.*?)</mnoDeliveryCode>").matcher(xml);
		if (matcher9.find()) {
			mnoDeliveryCode = matcher9.group(1);
			_respObj.setMnoDeliveryCode(mnoDeliveryCode);
		}

		Matcher matcher10 = Pattern.compile("<totalCharged>(.*?)</totalCharged>").matcher(xml);
		if (matcher10.find()) {
			totalCharged = matcher10.group(1);
			_respObj.setTotalCharged(totalCharged);
		}

		Matcher matcher11 = Pattern.compile("<mcc>(.*?)</mcc>").matcher(xml);
		if (matcher11.find()) {
			mcc = matcher11.group(1);
			_respObj.setMcc(mcc);
		}

		Matcher matcher12 = Pattern.compile("<mnc>(.*?)</mnc>").matcher(xml);
		if (matcher12.find()) {
			mnc = matcher12.group(1);
			_respObj.setMnc(mnc);
		}

		Matcher matcher13 = Pattern.compile("<chargingTime>(.*?)</chargingTime>").matcher(xml);
		if (matcher13.find()) {
			chargingTime = matcher13.group(1);
			_respObj.setChargingtime(chargingTime);
		}

		Matcher matcher14 = Pattern.compile("<requestType>(.*?)</requestType>").matcher(xml);
		if (matcher14.find()) {
			requestType = matcher14.group(1);
			_respObj.setRequesttype(requestType);
		}

		Matcher matcher15 = Pattern.compile("<typeEvent>(.*?)</typeEvent>").matcher(xml);
		if (matcher15.find()) {
			typeEvent = matcher15.group(1);
			_respObj.setTypeevent(typeEvent);
		}

		Matcher matcher16 = Pattern.compile("<text>(.*?)</text>").matcher(xml);
		if (matcher16.find()) {
			text = matcher16.group(1);
			_respObj.setText(text);
		}

		System.out.println("response:" + _respObj);

		return _respObj;
	}
}
