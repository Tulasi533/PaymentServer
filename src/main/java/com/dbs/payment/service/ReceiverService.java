package com.dbs.payment.service;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.payment.model.Receiver;
import com.dbs.payment.repo.ReceiverRepo;

@Service
public class ReceiverService {

	@Autowired
	ReceiverRepo receiverRepo;
	
	public Receiver getReceiver(String bic) {
		Receiver receiver = receiverRepo.findById(bic).orElse(new Receiver());
		if(receiver.getBankName() == null) {
			String mbic = bic.substring(0, 8);
			mbic += "XXX";
			receiver = receiverRepo.findById(mbic).orElse(new Receiver());
		}
		return receiver;
	}
	
	public String checkReceiver(String name) {
		String res = "Authorized User...";
		File file = new File("C:\\Users\\Administrator\\Desktop\\PaymentProject\\sdnlist.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNext()) {
				final String lineFromFile = scanner.nextLine();
				if(lineFromFile.contains(name)) {
					res = "Unauthorized User!!";
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("Something went wrong!!");
		}
		return res;
	}
}
