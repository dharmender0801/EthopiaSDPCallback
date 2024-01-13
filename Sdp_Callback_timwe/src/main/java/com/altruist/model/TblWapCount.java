package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_wap_count")
public class TblWapCount {
	@Id
	@Column(name = "rowno")
	private String rowno;

	@Column(name = "msisdn")
	private String msisdn;

	@Column(name = "date_time")
	private String dateTime;

	@Column(name = "pkgname")
	private String pkgname;

	@Column(name = "cpid")
	private String cpid;

	public String getRowno() {
		return rowno;
	}

	public void setRowno(String rowno) {
		this.rowno = rowno;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getPkgname() {
		return pkgname;
	}

	public void setPkgname(String pkgname) {
		this.pkgname = pkgname;
	}

	public String getCpid() {
		return cpid;
	}

	public void setCpid(String cpid) {
		this.cpid = cpid;
	}

}
