package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("ele")
public class EliteCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		return amount*0.15;
	}

}
