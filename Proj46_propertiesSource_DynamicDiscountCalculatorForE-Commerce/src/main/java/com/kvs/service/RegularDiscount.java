package com.kvs.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("regular")
public  class RegularDiscount implements DiscountStrategy {
	 
	@Value("${discount.regular.flat}")
	private double flat;
	@Value("${discount.regular.percentage}")
	private double percentage;
	@Override
	public double calculateDiscount(double amount) {
		
		return amount*(percentage/100.0)+flat;
	}

}
