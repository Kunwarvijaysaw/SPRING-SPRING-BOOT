package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("residential")
public class ResidentialBilling  implements BillingStrategy{

	@Override
	public double calculateBill(double units) {
		int rate =5;
		System.out.println("Customer Type: Residential");
		System.out.println("Units Consumed : "+units);
		System.out.println("Rate per Unit : ₹"+rate);
		return rate*units;
	}

}
