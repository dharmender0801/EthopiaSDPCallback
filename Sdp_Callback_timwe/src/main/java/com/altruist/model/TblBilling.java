package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;


@Entity
@Table(name="tbl_billing")
public class TblBilling 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rowno")
	private Integer rowno;
	
	@Column(name="ani")
	private String ani;
	
	@Column(name="total_amount")
	private String total_amount;
	
	@Column(name="langid")
	private String Langid;
	
	@Column(name="deducted_amount")
	private String deducted_amount;
	
	@Column(name="user_balance")
	private String user_balance;
	
	@Column(name="isprepaid")
	private String isprepaid;
	
	@Column(name="datetime")
	private String datetime;
	
	@Column(name="recordstatus")
	private Integer recordstatus;
	
	@Column(name="errordesc")
	private String errordesc;
	
	@Column(name="circleid")
	private String circleid;
	
	@Column(name="type_event")
	private String type_event;
	
	@Column(name="pkg_type")
	private String pkgtype;
	
	@Column(name="mode")
	private String mode;
	
	@Column(name="process_datetime")
	private String process_datetime;
	
	@Column(name="src")
	private String src;
	
	@Column(name="noofattempt")
	private Integer noofattempt;
	
	@Column(name="servicename")
	private String serviceName;
	
	@Column(name="next_process_date")
	private String next_process_date;
	
	@Column(name="sysresponse")
	private String sysresponse;
	
	@Column(name="process_date")
	private String process_date;
	
	@Column(name="dnis")
	private String dnis;
	
	@Column(name="fallback")
	private Integer fallback;

	@Column(name="dailycounter")
	private Integer dailycounter;
	
	@Column(name="monthlycounter")
	private Integer monthlycounter;
	
	@Column(name="productcode")
	private String productcode;
	
	@Transient
	private Integer dbTransType;
	
	@Transient
	private boolean transType;
	
	@Transient
	private Integer dbTransState;
	
	@Transient
	private String charging_sms;
	
	@Transient
	private String low_balance_sms;
	
	@Transient
	private Integer validity;
	
	@Transient
	private String response;
	
	@Transient
	private Integer message_send_days;

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getAni() {
		return ani;
	}

	public void setAni(String ani) {
		this.ani = ani;
	}
	
	public String getLangid() {
		return Langid;
	}

	public void setLangid(String langid) {
		Langid = langid;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	public String getDeducted_amount() {
		return deducted_amount;
	}

	public void setDeducted_amount(String deducted_amount) {
		this.deducted_amount = deducted_amount;
	}

	public String getUser_balance() {
		return user_balance;
	}

	public void setUser_balance(String user_balance) {
		this.user_balance = user_balance;
	}

	public String getIsprepaid() {
		return isprepaid;
	}

	public void setIsprepaid(String isprepaid) {
		this.isprepaid = isprepaid;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public Integer getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(Integer recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getErrordesc() {
		return errordesc;
	}

	public void setErrordesc(String errordesc) {
		this.errordesc = errordesc;
	}

	public String getCircleid() {
		return circleid;
	}

	public void setCircleid(String circleid) {
		this.circleid = circleid;
	}

	public String getType_event() {
		return type_event;
	}

	public void setType_event(String type_event) {
		this.type_event = type_event;
	}

	public String getPkgtype() {
		return pkgtype;
	}

	public void setPkgtype(String pkgtype) {
		this.pkgtype = pkgtype;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public String getProcess_datetime() {
		return process_datetime;
	}

	public void setProcess_datetime(String process_datetime) {
		this.process_datetime = process_datetime;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public Integer getNoofattempt() {
		return noofattempt;
	}

	public void setNoofattempt(Integer noofattempt) {
		this.noofattempt = noofattempt;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getNext_process_date() {
		return next_process_date;
	}

	public void setNext_process_date(String next_process_date) {
		this.next_process_date = next_process_date;
	}

	public String getSysresponse() {
		return sysresponse;
	}

	public void setSysresponse(String sysresponse) {
		this.sysresponse = sysresponse;
	}

	public Integer getDailycounter() {
		return dailycounter;
	}

	public void setDailycounter(Integer dailycounter) {
		this.dailycounter = dailycounter;
	}

	public Integer getMonthlycounter() {
		return monthlycounter;
	}

	public void setMonthlycounter(Integer monthlycounter) {
		this.monthlycounter = monthlycounter;
	}

	public Integer getDbTransType() {
		return dbTransType;
	}

	public void setDbTransType(Integer dbTransType) {
		this.dbTransType = dbTransType;
	}

	public boolean getTransType() {
		return transType;
	}

	public void setTransType(boolean transType) {
		this.transType = transType;
	}

	public Integer getDbTransState() {
		return dbTransState;
	}

	public void setDbTransState(Integer dbTransState) {
		this.dbTransState = dbTransState;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}
	
	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	public String getCharging_sms() {
		return charging_sms;
	}

	public void setCharging_sms(String charging_sms) {
		this.charging_sms = charging_sms;
	}

	public String getLow_balance_sms() {
		return low_balance_sms;
	}

	public void setLow_balance_sms(String low_balance_sms) {
		this.low_balance_sms = low_balance_sms;
	}

	public Integer getMessage_send_days() {
		return message_send_days;
	}

	public void setMessage_send_days(Integer message_send_days) {
		this.message_send_days = message_send_days;
	}

	public String getProcess_date() {
		return process_date;
	}

	public void setProcess_date(String process_date) {
		this.process_date = process_date;
	}

	public String getDnis() {
		return dnis;
	}

	public void setDnis(String dnis) {
		this.dnis = dnis;
	}

	public Integer getFallback() {
		return fallback;
	}

	public void setFallback(Integer fallback) {
		this.fallback = fallback;
	}

	public String getProductcode() {
		return productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	
}
