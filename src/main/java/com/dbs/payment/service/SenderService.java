package com.dbs.payment.service;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.model.Sender;
import com.dbs.payment.repo.SenderRepo;

@Service
public class SenderService {

	@Autowired
	SenderRepo senderRepo;
	
	public String validateDayName(String date) throws ParseException {
		String res = "";
		Format f = new SimpleDateFormat("EEEE");
		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(date);
		res = f.format(date1);
		return res;
	}
	
	public Sender getSender(String custId) {
		Sender sender = senderRepo.findById(custId).orElse(new Sender());
		return sender;
	}
	
	public String updateClearBalance(String custId, double clearBalance) {
		String res = "";
		try {
			Sender sender = senderRepo.findById(custId).orElse(new Sender());
			if(sender.getAccHolderName() == null) {
				res = "Sender not exist!!";
			}else {
				res = "Clear Balance updated...";
				sender.setClearBalance(clearBalance);
				senderRepo.save(sender);
			}
			
		} catch(Exception e) {
			res = "Something went wrong!!";
			e.printStackTrace();
		}
		return res;
	}
}
