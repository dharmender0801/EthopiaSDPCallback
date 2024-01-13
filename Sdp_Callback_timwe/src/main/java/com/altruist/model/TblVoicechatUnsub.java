package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_voicechat_unsub")
public class TblVoicechatUnsub {
	@Id
	@Column(name = "ani")
	private String ani;

	@Column(name = "gender")
	private String gender;

	@Column(name = "age")
	private String age;

	@Column(name = "opratorid")
	private String operatorid;

	@Column(name = "circleid")
	private String circleid;

	@Column(name = "langid")
	private String langid;

	@Column(name = "dnis")
	private String dnis;

	@Column(name = "unsubdnis")
	private String unsubdnis;

	@Column(name = "sub_date_time")
	private String sub_date_time;

	@Column(name = "unsub_date_time")
	private String unsub_date_time;

	@Column(name = "last_billed_date")
	private String last_billed_date;

	@Column(name = "next_billed_date")
	private String next_billed_date;

	@Column(name = "recordstatus")
	private String recordstatus;

	@Column(name = "user_type")
	private String user_type;

	@Column(name = "recordprofile")
	private String recordprofile;

	@Column(name = "planid")
	private Integer planid;

	@Column(name = "subscriptionid")
	private Integer subscriptionid;

	@Column(name = "mact")
	private String mact;

	@Column(name = "mdact")
	private String mdact;

	@Column(name = "ren_pack")
	private String ren_pack;

	@Column(name = "default_amount")
	private String default_amount;

	@Column(name = "voicechatid")
	private String voicechatid;

	@Column(name = "subamount")
	private Integer subamount;

	public String getAni() {
		return ani;
	}

	public void setAni(String ani) {
		this.ani = ani;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getOperatorid() {
		return operatorid;
	}

	public void setOperatorid(String operatorid) {
		this.operatorid = operatorid;
	}

	public String getCircleid() {
		return circleid;
	}

	public void setCircleid(String circleid) {
		this.circleid = circleid;
	}

	public String getLangid() {
		return langid;
	}

	public void setLangid(String langid) {
		this.langid = langid;
	}

	public String getDnis() {
		return dnis;
	}

	public void setDnis(String dnis) {
		this.dnis = dnis;
	}

	public String getUnsubdnis() {
		return unsubdnis;
	}

	public void setUnsubdnis(String unsubdnis) {
		this.unsubdnis = unsubdnis;
	}

	public String getSub_date_time() {
		return sub_date_time;
	}

	public void setSub_date_time(String sub_date_time) {
		this.sub_date_time = sub_date_time;
	}

	public String getUnsub_date_time() {
		return unsub_date_time;
	}

	public void setUnsub_date_time(String unsub_date_time) {
		this.unsub_date_time = unsub_date_time;
	}

	public String getLast_billed_date() {
		return last_billed_date;
	}

	public void setLast_billed_date(String last_billed_date) {
		this.last_billed_date = last_billed_date;
	}

	public String getNext_billed_date() {
		return next_billed_date;
	}

	public void setNext_billed_date(String next_billed_date) {
		this.next_billed_date = next_billed_date;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}

	public String getUser_type() {
		return user_type;
	}

	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}

	public String getRecordprofile() {
		return recordprofile;
	}

	public void setRecordprofile(String recordprofile) {
		this.recordprofile = recordprofile;
	}

	public Integer getPlanid() {
		return planid;
	}

	public void setPlanid(Integer planid) {
		this.planid = planid;
	}

	public Integer getSubscriptionid() {
		return subscriptionid;
	}

	public void setSubscriptionid(Integer subscriptionid) {
		this.subscriptionid = subscriptionid;
	}

	public String getMact() {
		return mact;
	}

	public void setMact(String mact) {
		this.mact = mact;
	}

	public String getMdact() {
		return mdact;
	}

	public void setMdact(String mdact) {
		this.mdact = mdact;
	}

	public String getRen_pack() {
		return ren_pack;
	}

	public void setRen_pack(String ren_pack) {
		this.ren_pack = ren_pack;
	}

	public String getDefault_amount() {
		return default_amount;
	}

	public void setDefault_amount(String default_amount) {
		this.default_amount = default_amount;
	}

	public String getVoicechatid() {
		return voicechatid;
	}

	public void setVoicechatid(String voicechatid) {
		this.voicechatid = voicechatid;
	}

	public Integer getSubamount() {
		return subamount;
	}

	public void setSubamount(Integer subamount) {
		this.subamount = subamount;
	}

}
