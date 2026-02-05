package com.kvs.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("reg")

public class RegularCustomerDiscount implements DiscountStrategy{

	@Override
	public double calculateDiscount(double amount) {
		
		return amount*0.05;
	}

}
