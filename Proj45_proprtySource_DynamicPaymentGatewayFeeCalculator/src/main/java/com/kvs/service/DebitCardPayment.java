package com.kvs.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("debit")
public class DebitCardPayment implements PaymentStrategy{
	
	@Value("${payment.debit.base}")
	private double base;
	@Value("${payment.debit.percentage}")
	private double percentage;
	
	@Override
	public double calculateFee(double amount) {
		return amount*(percentage/100.0)+base;
	}
}
