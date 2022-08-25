package com.dbs.payment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.payment.model.TransferType;
import com.dbs.payment.service.TransferTypeService;

@CrossOrigin(origins = "*")
@RestController
public class TransferTypeController {

	@Autowired
	TransferTypeService transferTypeService;
	
	@GetMapping("/getAllTransferTypes")
	public List<TransferType> getAllTransferTypes() {
		return transferTypeService.getAllTransferTypes();
	}
}
