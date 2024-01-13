package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_fallback_info")
public class TblFallbackInfo 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rowno")
	private Integer rowno;
	
	@Column(name="pack_type")
	private String pack_type;
	
	@Column(name="total_amount")
	private Integer total_amount;
	
	@Column(name="fallback_amount")
	private Float fallback_amount;
	
	@Column(name="validity")
	private Integer validity;
	
	@Column(name="charging_sms")
	private String charging_sms;
	
	@Column(name="low_balance_sms")
	private String low_balance_sms;
	
	@Column(name="message_send_days")
	private Integer message_send_days;
	
	@Column(name="charging_pack")
	private String charging_pack;

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getPack_type() {
		return pack_type;
	}

	public void setPack_type(String pack_type) {
		this.pack_type = pack_type;
	}

	public Integer getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Integer total_amount) {
		this.total_amount = total_amount;
	}

	public Float getFallback_amount() {
		return fallback_amount;
	}

	public void setFallback_amount(Float fallback_amount) {
		this.fallback_amount = fallback_amount;
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

	public String getCharging_pack() {
		return charging_pack;
	}

	public void setCharging_pack(String charging_pack) {
		this.charging_pack = charging_pack;
	}
}
