package com.dbs.payment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbs.payment.model.Sender;

public interface SenderRepo extends JpaRepository<Sender, String>{

}
