package com.altruist.response;

import lombok.Data;

@Data
public class ResponseParamSDP {
	private int id; 
	private String msisdn;
	private String productId;
	private String pricepointId;
	private String entryChannel;
	private String transactionUUID;
	private String userIdentifier;
	private String largeAccount;
	private String mnoDeliveryCode;
	private String totalCharged;
	private String mcc;
	private String mnc;
	private String text ;
	private Integer Dbtrans;
	private String chargingtype;
	private String chargingtime;
	private String requesttype;
	private String typeevent;
}
