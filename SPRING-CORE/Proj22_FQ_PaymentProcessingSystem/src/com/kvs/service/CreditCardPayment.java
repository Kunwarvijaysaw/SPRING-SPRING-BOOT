package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("card")
public class CreditCardPayment implements PaymentService{

	@Override
	public void processPayment() {
		System.out.println("paymment done using card");
		
	}

}
