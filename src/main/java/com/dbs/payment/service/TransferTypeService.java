package com.dbs.payment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.model.TransferType;
import com.dbs.payment.repo.TransferTypeRepo;

@Service
public class TransferTypeService {

	@Autowired
	TransferTypeRepo transferTypeRepo;
	
	public List<TransferType> getAllTransferTypes() {
		return transferTypeRepo.findAll();
	}
}
