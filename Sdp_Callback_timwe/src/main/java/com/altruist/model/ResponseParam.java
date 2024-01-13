package com.altruist.model;

public class ResponseParam 
{
	private String Amount;
	private Integer dbState;
	private String ChargingTime;
	private String Response;
	private String errorcode;
	private String errormessage;
	private String productid;
	private String MSISDN;
	private String REN_xactionId;
	private String REN_errorCode;
	private String REN_errorMsg;
	private String REN_amount;
	private String REN_chargigTime;
	private String REN_msisdn;
	private String REN_productId;
	private String REN_response;
	private int dbTransState;
	private boolean transType;
	
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public Integer getDbState() {
		return dbState;
	}
	public void setDbState(Integer dbState) {
		this.dbState = dbState;
	}
	public String getChargingTime() {
		return ChargingTime;
	}
	public void setChargingTime(String chargingTime) {
		ChargingTime = chargingTime;
	}
	public String getErrorcode() {
		return errorcode;
	}
	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getResponse() {
		return Response;
	}
	public void setResponse(String response) {
		Response = response;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public String getREN_xactionId() {
		return REN_xactionId;
	}
	public void setREN_xactionId(String rEN_xactionId) {
		REN_xactionId = rEN_xactionId;
	}
	public String getREN_errorCode() {
		return REN_errorCode;
	}
	public void setREN_errorCode(String rEN_errorCode) {
		REN_errorCode = rEN_errorCode;
	}
	public String getREN_errorMsg() {
		return REN_errorMsg;
	}
	public void setREN_errorMsg(String rEN_errorMsg) {
		REN_errorMsg = rEN_errorMsg;
	}
	public String getREN_amount() {
		return REN_amount;
	}
	public void setREN_amount(String rEN_amount) {
		REN_amount = rEN_amount;
	}
	public String getREN_chargigTime() {
		return REN_chargigTime;
	}
	public void setREN_chargigTime(String rEN_chargigTime) {
		REN_chargigTime = rEN_chargigTime;
	}
	public String getREN_msisdn() {
		return REN_msisdn;
	}
	public void setREN_msisdn(String rEN_msisdn) {
		REN_msisdn = rEN_msisdn;
	}
	public String getREN_productId() {
		return REN_productId;
	}
	public void setREN_productId(String rEN_productId) {
		REN_productId = rEN_productId;
	}
	public String getREN_response() {
		return REN_response;
	}
	public void setREN_response(String rEN_response) {
		REN_response = rEN_response;
	}
	public boolean getTransType() {
		return transType;
	}
	public void setTransType(boolean transType) {
		this.transType = transType;
	}
	public int getDbTransState() {
		return dbTransState;
	}
	public void setDbTransState(int dbTransState) {
		this.dbTransState = dbTransState;
	}
}
