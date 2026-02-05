package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("industrial")
public class IndustrialBilling implements BillingStrategy{

	@Override
	public double calculateBill(double units) {
		int rate =10;
		
		System.out.println("Customer Type: Industrial");
		System.out.println("Units Consumed : "+units);
		System.out.println("Rate per Unit : ₹"+rate);
		return rate*units;
	}

}
