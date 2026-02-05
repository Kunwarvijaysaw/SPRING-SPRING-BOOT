package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ElectricityBillingSystem {
	@Autowired
	@Qualifier("residential")
	BillingStrategy billingStrategy;
	
	public void showBill(double units) {
		double calculateDiscount = billingStrategy.calculateBill(units);
		
		System.out.println("Total Bill Amount: ₹"+calculateDiscount);
	
	
	}


	
}
