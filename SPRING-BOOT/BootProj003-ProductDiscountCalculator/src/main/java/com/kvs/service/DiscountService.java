package com.kvs.service;

import org.springframework.stereotype.Component;
@Component
public class DiscountService {
	
	public double applyDiscount(double price, double discountPercentage) {
		double totalAmount=price-(price*(discountPercentage/100));
		return totalAmount;
		
	}

}
