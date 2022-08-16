package com.dbs.payment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TransactionHistory")
public class TransactionHistory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String tid;
	private String senderName;
	private String receiverName;
	private double amount;
	
	
	

}
