package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_thread_configuration")
public class ThreadModel {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "rowno")
	private Integer rowno;

	@Column(name = "circleId")
	private String circleId;

	@Column(name = "threadno")
	private Integer threadno;

	@Column(name = "renwaltable")
	private String renwaltable;

	@Column(name = "activationtable")
	private String activationtable;

	@Column(name = "charginglogic")
	private String charginglogic;

	@Column(name = "thread_type")
	private String thread_type;

	@Column(name = "days5logic")
	private Integer days5logic;

	@Column(name = "isactive")
	private Integer isactive;

	@Column(name = "msg_circle")
	private String msg_circle;

	@Column(name = "fallback")
	private String fallBack;

	@Column(name = "billing_start_time")
	private Integer billing_start_time;

	@Column(name = "billing_end_time")
	private Integer billing_end_time;

	@Column(name = "sleep_time")
	private Long sleep_time;

	@Column(name = "sleep_time_request")
	private Long sleep_time_request;

	@Column(name = "process_hour")
	private Integer processhour;

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getCircleId() {
		return circleId;
	}

	public void setCircleId(String circleId) {
		this.circleId = circleId;
	}

	public Integer getThreadno() {
		return threadno;
	}

	public void setThreadno(Integer threadno) {
		this.threadno = threadno;
	}

	public String getRenwaltable() {
		return renwaltable;
	}

	public void setRenwaltable(String renwaltable) {
		this.renwaltable = renwaltable;
	}

	public String getActivationtable() {
		return activationtable;
	}

	public void setActivationtable(String activationtable) {
		this.activationtable = activationtable;
	}

	public String getCharginglogic() {
		return charginglogic;
	}

	public void setCharginglogic(String charginglogic) {
		this.charginglogic = charginglogic;
	}

	public String getThread_type() {
		return thread_type;
	}

	public void setThread_type(String thread_type) {
		this.thread_type = thread_type;
	}

	public Integer getDays5logic() {
		return days5logic;
	}

	public void setDays5logic(Integer days5logic) {
		this.days5logic = days5logic;
	}

	public Integer getIsactive() {
		return isactive;
	}

	public void setIsactive(Integer isactive) {
		this.isactive = isactive;
	}

	public String getMsg_circle() {
		return msg_circle;
	}

	public void setMsg_circle(String msg_circle) {
		this.msg_circle = msg_circle;
	}

	public String getFallBack() {
		return fallBack;
	}

	public void setFallBack(String fallBack) {
		this.fallBack = fallBack;
	}

	public Integer getBilling_start_time() {
		return billing_start_time;
	}

	public void setBilling_start_time(Integer billing_start_time) {
		this.billing_start_time = billing_start_time;
	}

	public Integer getBilling_end_time() {
		return billing_end_time;
	}

	public void setBilling_end_time(Integer billing_end_time) {
		this.billing_end_time = billing_end_time;
	}

	public Long getSleep_time() {
		return sleep_time;
	}

	public void setSleep_time(Long sleep_time) {
		this.sleep_time = sleep_time;
	}

	public Long getSleep_time_request() {
		return sleep_time_request;
	}

	public void setSleep_time_request(Long sleep_time_request) {
		this.sleep_time_request = sleep_time_request;
	}

	public Integer getProcesshour() {
		return processhour;
	}

	public void setProcesshour(Integer processhour) {
		this.processhour = processhour;
	}

}
