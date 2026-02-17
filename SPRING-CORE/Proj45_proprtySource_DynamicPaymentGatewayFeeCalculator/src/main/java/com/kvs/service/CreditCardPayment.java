package com.kvs.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCardPayment implements PaymentStrategy {


	@Value("${payment.credit.base}")
	private double base;
	@Value("${payment.credit.percentage}")
	private double percentage;
	
	@Override
	public double calculateFee(double amount) {
		return amount*(percentage/100.0)+base;
	}
}
