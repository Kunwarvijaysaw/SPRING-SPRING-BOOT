package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("pre")
public class PremiumCustomerDiscount implements DiscountStrategy {
	
	@Override
	public double calculateDiscount(double amount) {
		return amount*0.10;
	}

}
