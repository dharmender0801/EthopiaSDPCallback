package com.altruist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altruist.model.BillingSuccess;
import com.altruist.model.TblVoicechat;

public interface TblVoicechatRepo extends JpaRepository<TblVoicechat, Integer> {

	TblVoicechat findByAni(String msisdn);

	void deleteByAni(String msisdn);

}
