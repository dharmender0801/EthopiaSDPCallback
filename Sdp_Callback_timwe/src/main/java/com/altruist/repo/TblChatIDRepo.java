package com.altruist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.altruist.model.TblChatID;

public interface TblChatIDRepo extends JpaRepository<TblChatID, String> {

	TblChatID findFirstByRecordstatus(String recordstatus);

}
