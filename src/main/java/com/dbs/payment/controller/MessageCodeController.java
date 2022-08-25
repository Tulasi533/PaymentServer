package com.dbs.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payment.model.MessageCode;
import com.dbs.payment.service.MessageCodeService;

@CrossOrigin(origins = "*")
@RestController
public class MessageCodeController {

	@Autowired
	MessageCodeService messageCodeService;
	
	@GetMapping("/getAllMessageCodes") 
	public List<MessageCode> getAllMessageCodes() {
		return messageCodeService.getAllMessageCodes();
	}
}
