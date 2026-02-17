package com.kvs.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("premium")
public class PremiumDiscount implements DiscountStrategy {
 
	@Value("${discount.premium.flat}")
	private double flat;
	@Value("${discount.premium.percentage}")
	private double percentage;
	@Override
	public double calculateDiscount(double amount) {
		
		return amount*(percentage/100.0)+flat;
	}
}
