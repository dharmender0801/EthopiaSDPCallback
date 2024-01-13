package com.altruist.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbl_chatid")
public class TblChatID 
{
	@Id
	@Column(name="chatid")
	private String chatid;
	
	@Column(name="recordstatus")
	private String recordstatus;
	
	
	
	public String getChatid() {
		return chatid;
	}

	public void setChatid(String chatid) {
		this.chatid = chatid;
	}

	public String getRecordstatus() {
		return recordstatus;
	}

	public void setRecordstatus(String recordstatus) {
		this.recordstatus = recordstatus;
	}
}
