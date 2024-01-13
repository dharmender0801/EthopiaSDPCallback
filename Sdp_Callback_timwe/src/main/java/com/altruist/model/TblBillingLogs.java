package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_billinglogs")
public class TblBillingLogs 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rowno")
	private Integer rowno;
	
	@Column(name="ani")
	private String ani;
	
	@Column(name="total_amount")
	private String total_amount;
	
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
	
	@Column(name="process_date")
	private String process_date;
	
	@Column(name="type_event")
	private String type_event;
	
	@Column(name="is_emm")
	private String is_emm;
	
	@Column(name="submode")
	private String submode;
	
	@Column(name="process_datetime")
	private String process_datetime;
	
	@Column(name="src")
	private String src;
	
	@Column(name="noofattempt")
	private Integer noofattempt;
	
	@Column(name="transaction_id")
	private String  transactionid;
	
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

	public String getProcess_date() {
		return process_date;
	}

	public void setProcess_date(String process_date) {
		this.process_date = process_date;
	}

	public String getType_event() {
		return type_event;
	}

	public void setType_event(String type_event) {
		this.type_event = type_event;
	}

	public String getIs_emm() {
		return is_emm;
	}

	public void setIs_emm(String is_emm) {
		this.is_emm = is_emm;
	}

	public String getSubmode() {
		return submode;
	}

	public void setSubmode(String submode) {
		this.submode = submode;
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

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

}
