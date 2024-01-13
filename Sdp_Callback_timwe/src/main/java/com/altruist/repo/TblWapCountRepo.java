package com.altruist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altruist.model.TblWapCount;

public interface TblWapCountRepo extends JpaRepository<TblWapCount, Long> {

	TblWapCount findTop1ByPkgnameAndMsisdnOrderByDateTimeAsc(String pkgname, String msisdn);
	

}
