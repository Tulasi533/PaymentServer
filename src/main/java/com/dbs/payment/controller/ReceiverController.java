package com.dbs.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payment.model.Receiver;
import com.dbs.payment.service.ReceiverService;

@RestController
public class ReceiverController {

	@Autowired
	ReceiverService receiverService;
	
	@GetMapping("/getReceiver")
	public Receiver getReceiver(@RequestParam String bic) {
		return receiverService.getReceiver(bic);
	}
	
	@GetMapping("/checkReceiver")
	public String checkReceiver(@RequestParam String name) {
		return receiverService.checkReceiver(name);
	}
}
