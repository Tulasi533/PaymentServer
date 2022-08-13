package com.dbs.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.payment.model.Receiver;

public interface ReceiverRepo extends JpaRepository<Receiver, String>{

}
