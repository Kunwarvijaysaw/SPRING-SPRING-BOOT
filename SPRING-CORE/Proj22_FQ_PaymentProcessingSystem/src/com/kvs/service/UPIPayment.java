package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("Upi")
public class UPIPayment implements PaymentService {

	@Override
	public void processPayment() {
		System.out.println(" Payment done using upi....");
		
	}

}
