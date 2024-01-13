package com.altruist.model;

public class ResponseParamSDP
{
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

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getPricepointId() {
		return pricepointId;
	}
	public void setPricepointId(String pricepointId) {
		this.pricepointId = pricepointId;
	}
	public String getEntryChannel() {
		return entryChannel;
	}
	public void setEntryChannel(String entryChannel) {
		this.entryChannel = entryChannel;
	}
	public String getTransactionUUID() {
		return transactionUUID;
	}
	public void setTransactionUUID(String transactionUUID) {
		this.transactionUUID = transactionUUID;
	}
	public String getUserIdentifier() {
		return userIdentifier;
	}
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	public String getLargeAccount() {
		return largeAccount;
	}
	public void setLargeAccount(String largeAccount) {
		this.largeAccount = largeAccount;
	}
	public String getMnoDeliveryCode() {
		return mnoDeliveryCode;
	}
	public void setMnoDeliveryCode(String mnoDeliveryCode) {
		this.mnoDeliveryCode = mnoDeliveryCode;
	}
	public String getTotalCharged() {
		return totalCharged;
	}
	public void setTotalCharged(String totalCharged) {
		this.totalCharged = totalCharged;
	}
	public String getMcc() {
		return mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}
	public String getMnc() {
		return mnc;
	}
	public void setMnc(String mnc) {
		this.mnc = mnc;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Integer getDbtrans() {
		return Dbtrans;
	}
	public void setDbtrans(Integer dbtrans) {
		Dbtrans = dbtrans;
	}
	public String getChargingtype() {
		return chargingtype;
	}
	public void setChargingtype(String chargingtype) {
		this.chargingtype = chargingtype;
	}
	
	public String getChargingtime() {
		return chargingtime;
	}
	public void setChargingtime(String chargingtime) {
		this.chargingtime = chargingtime;
	}

	public String getRequesttype() {
		return requesttype;
	}
	public void setRequesttype(String requesttype) {
		this.requesttype = requesttype;
	}
	
	public String getTypeevent() {
		return typeevent;
	}
	public void setTypeevent(String typeevent) {
		this.typeevent = typeevent;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", msisdn=" + msisdn + ", productId=" + productId + ", pricepointId="
				+ pricepointId + ", entryChannel=" + entryChannel + ", transactionUUID=" + transactionUUID
				+ ", userIdentifier=" + userIdentifier + ", largeAccount=" + largeAccount + ", mnoDeliveryCode="
				+ mnoDeliveryCode + ", totalCharged=" + totalCharged + ", mcc=" + mcc + ", mnc=" + mnc + ", text="
				+ text + ", Dbtrans=" + Dbtrans + ", chargingtype=" + chargingtype + ", chargingtime=" + chargingtime
				+ ", requesttype=" + requesttype + ", typeevent=" + typeevent + "]";
	}
}


