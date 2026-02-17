package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("commercial")
public class CommercialBilling implements BillingStrategy {

	@Override
	public double calculateBill(double units) {
		int rate =8;
		System.out.println("Customer Type: Commercial");
		System.out.println("Units Consumed : "+units);
		System.out.println("Rate per Unit : ₹"+rate);
		return rate *units;
	}
	

}
