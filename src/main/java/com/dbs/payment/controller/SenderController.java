package com.dbs.payment.controller;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payment.model.Sender;
import com.dbs.payment.service.SenderService;

@RestController
public class SenderController {
	
	@Autowired
	SenderService senderService;
	
	@GetMapping("/validateDayName")
	public String validateDayName(@RequestParam String date) throws ParseException {
		return senderService.validateDayName(date);
	}
	
	@GetMapping("/getSender")
	public Sender getSender(@RequestParam String custId) {
		return senderService.getSender(custId);
	}
	
	@PutMapping("/updateClearBalance")
	public String updateClearBalance(@RequestParam String custId, double balance) {
		return senderService.updateClearBalance(custId, balance);
	}
	

}
