package com.dbs.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.payment.model.TransferType;

public interface TransferTypeRepo extends JpaRepository<TransferType, String>{

}
