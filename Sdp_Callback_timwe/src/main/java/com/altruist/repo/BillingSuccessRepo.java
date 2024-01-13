package com.altruist.repo;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.altruist.model.BillingSuccess;

public interface BillingSuccessRepo extends JpaRepository<BillingSuccess, Long> {
	@Query("SELECT COUNT(e) FROM BillingSuccess e WHERE e.ani = :ani "
			+ "AND e.type_event = :typeEvent AND DATE(e.process_datetime) = :processDate "
			+ "AND e.transactionid = :transactionId")
	long countByAniAndTransactionIdAndTypeEventAndProcessDatetime(@Param("ani") String ani,
			@Param("transactionId") String transactionId, @Param("typeEvent") String typeEvent,
			@Param("processDate") Date processDate);
}