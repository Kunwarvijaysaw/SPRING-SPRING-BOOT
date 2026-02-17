package com.kvs.sbeans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class AccountBalanceManager {
	private double balance=900;
	
//	public AccountBalanceManager( double balance) {
//		super();
//		this.balance = balance;
//	}

	public double  getBalance() {
		return balance;
		
	}
	
	public void updateBalance(double amount) {
        balance += amount;
        System.out.println("Balance updated to " + balance);
    }
	

}
