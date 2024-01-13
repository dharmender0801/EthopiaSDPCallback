package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_error_code")
public class TblErrorcode 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rowno")
	private Integer rowno;
	
	@Column(name="errorcode_id")
	private String errorcode_id;
	
	@Column(name="errorcode")
	private String errorcode;
	
	@Column(name="module")
	private String module;
	
	@Column(name="delete_status")
	private String deletestatus;
	
	@Column(name="description")
	private String description;
	
	@Column(name="eror_description")
	private String erordescription;

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getErrorcode_id() {
		return errorcode_id;
	}

	public void setErrorcode_id(String errorcode_id) {
		this.errorcode_id = errorcode_id;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getDeletestatus() {
		return deletestatus;
	}

	public void setDeletestatus(String deletestatus) {
		this.deletestatus = deletestatus;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getErordescription() {
		return erordescription;
	}

	public void setErordescription(String erordescription) {
		this.erordescription = erordescription;
	}

}
