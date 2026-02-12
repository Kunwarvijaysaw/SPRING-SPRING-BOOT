package com.kvs.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("upi")
public class UpiPayment implements PaymentStrategy {

	@Value("${payment.upi.base}")
	private double base;
	@Value("${payment.upi.percentage}")
	private double percentage;
	
	@Override
	public double calculateFee(double amount) {
		return amount*(percentage/100.0)+base;
	}

}
