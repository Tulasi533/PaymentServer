package com.dbs.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.model.MessageCode;
import com.dbs.payment.repo.MessageCodeRepo;

@Service
public class MessageCodeService {
	
	@Autowired
	MessageCodeRepo messageCodeRepo;
	
	public List<MessageCode> getAllMessageCodes() {
		return messageCodeRepo.findAll();
	}

}
