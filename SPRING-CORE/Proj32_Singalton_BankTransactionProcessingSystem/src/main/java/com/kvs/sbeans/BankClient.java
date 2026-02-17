package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public final class BankClient {
	
	@Autowired
	TransactionService transaction;
	
	
	public void getTransaction() {
		transaction.processTransaction("deposit", 5000);
		transaction.processTransaction("withdraw", 500);

	}
	

}
