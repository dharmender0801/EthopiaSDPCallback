package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_product_info")
public class TblProduct 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="rowno")
	private Integer rowno;
	
	@Column(name="product_id")
	private String product_id;
	
	@Column(name="packcode")
	private String packcode;
	
	@Column(name="priceid")
	private String priceid;
	
	@Column(name="price")
	private String price;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="service_name")
	private String service_name;
	
	@Column(name="validity")
	private int validity;
	
	@Column(name="pack")
	private String pack;

	public Integer getRowno() {
		return rowno;
	}

	public void setRowno(Integer rowno) {
		this.rowno = rowno;
	}

	public String getProduct_id() {
		return product_id;
	}

	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}

	public String getPackcode() {
		return packcode;
	}

	public void setPackcode(String packcode) {
		this.packcode = packcode;
	}

	public String getPriceid() {
		return priceid;
	}

	public void setPriceid(String priceid) {
		this.priceid = priceid;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getService_name() {
		return service_name;
	}

	public void setService_name(String service_name) {
		this.service_name = service_name;
	}

	public int getValidity() {
		return validity;
	}

	public void setValidity(int validity) {
		this.validity = validity;
	}

	public String getPack() {
		return pack;
	}

	public void setPack(String pack) {
		this.pack = pack;
	}
	
}
