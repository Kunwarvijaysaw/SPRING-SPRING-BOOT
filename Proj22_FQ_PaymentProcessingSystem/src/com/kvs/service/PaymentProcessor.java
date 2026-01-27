package com.kvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessor {

	
	
	private PaymentService service;
	
	
	@Autowired
	public PaymentProcessor(@Qualifier("card") PaymentService service) {
		super();
		this.service = service;
	}



	public void makePayment() {
		service.processPayment();
	}
}
