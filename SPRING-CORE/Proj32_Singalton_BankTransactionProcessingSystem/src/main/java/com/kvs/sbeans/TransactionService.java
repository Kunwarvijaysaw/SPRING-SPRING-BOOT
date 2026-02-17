package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TransactionService {
	
	@Autowired
	AccountBalanceManager manager;


	
	public void processTransaction(String type, double amount) {

        if (type.equalsIgnoreCase("Deposit")) {
            manager.updateBalance(amount);
            System.out.println("Deposit successful");

        } else if (type.equalsIgnoreCase("Withdraw")) {

            if (manager.getBalance() >= amount) {
                manager.updateBalance(-amount);
                System.out.println("Transaction successful");
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }
	


}
