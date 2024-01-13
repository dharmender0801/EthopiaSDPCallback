package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class SDPErrorCode 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="srNo")
	private Integer srNo;
	
	@Column(name="errorCode")
	private String errorCode;
	
	@Column(name="description")
	private String description;

	public Integer getSrNo() {
		return srNo;
	}

	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
