package com.dbs.payment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TransferType")
public class TransferType {

	@Id
	private String transferType;
	private String description;
	public TransferType() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransferType(String transferType, String description) {
		super();
		this.transferType = transferType;
		this.description = description;
	}
	public String getTransferType() {
		return transferType;
	}
	public void setTransferType(String transferType) {
		this.transferType = transferType;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "TransferType [transferType=" + transferType + ", description=" + description + "]";
	}
	
	
}
