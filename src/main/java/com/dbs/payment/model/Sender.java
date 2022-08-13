package com.dbs.payment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sender")
public class Sender {
	
	@Id
	private String customerId;
	private String accHolderName;
	private double clearBalance;
	private String overDraft;
	public Sender() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sender(String customerId, String accHolderName, double clearBalance, String overDraft) {
		super();
		this.customerId = customerId;
		this.accHolderName = accHolderName;
		this.clearBalance = clearBalance;
		this.overDraft = overDraft;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public double getClearBalance() {
		return clearBalance;
	}
	public void setClearBalance(double clearBalance) {
		this.clearBalance = clearBalance;
	}
	public String getOverDraft() {
		return overDraft;
	}
	public void setOverDraft(String overDraft) {
		this.overDraft = overDraft;
	}
	@Override
	public String toString() {
		return "Sender [customerId=" + customerId + ", accHolderName=" + accHolderName + ", clearBalance="
				+ clearBalance + ", overDraft=" + overDraft + "]";
	}
	
	
	
}
