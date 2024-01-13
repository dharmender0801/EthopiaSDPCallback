package com.altruist.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_altruist_promotion")
public class PromotionAltruist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "ani")
	private String ani;

	@Column(name = "promotion_date_time")
	private Date promotion_date_time;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAni() {
		return ani;
	}

	public void setAni(String ani) {
		this.ani = ani;
	}

	public Date getPromotion_date_time() {
		return promotion_date_time;
	}

	public void setPromotion_date_time(Date promotion_date_time) {
		this.promotion_date_time = promotion_date_time;
	}

}
