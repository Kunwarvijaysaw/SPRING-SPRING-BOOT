package com.kvs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

	@Autowired
	Map<String,PaymentStrategy> map;
	
	public void getPaymentFee(String type, double amount) {
		double calculateFee = map.get(type).calculateFee(amount);
		System.out.println(type.toUpperCase()+" Fee: "+calculateFee);
	}
}
