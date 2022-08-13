package com.dbs.payment.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Receiver")
public class Receiver {
	
	@Id
	private String bic;
	private String bankName;
	public Receiver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Receiver(String bic, String bankName) {
		super();
		this.bic = bic;
		this.bankName = bankName;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Receiver [bic=" + bic + ", bankName=" + bankName + "]";
	}
	
	
}
