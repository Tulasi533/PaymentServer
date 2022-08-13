package com.dbs.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.payment.model.MessageCode;

public interface MessageCodeRepo extends JpaRepository<MessageCode, String>{

}
