package com.dbs.payment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MessageCode")
public class MessageCode {
	
	@Id
	private String msgCode;
	private String instruction;
	public MessageCode() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MessageCode(String msgCode, String instruction) {
		super();
		this.msgCode = msgCode;
		this.instruction = instruction;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getInstruction() {
		return instruction;
	}
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}
	@Override
	public String toString() {
		return "MessageCode [msgCode=" + msgCode + ", instruction=" + instruction + "]";
	}
	
	

}
