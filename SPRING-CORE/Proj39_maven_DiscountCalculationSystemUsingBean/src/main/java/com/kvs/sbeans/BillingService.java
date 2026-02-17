package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class BillingService {
	
	@Autowired
//	@Qualifier("reg")
	DiscountStrategy discountStrategy;
	
	
	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}


	public void generateBill(double amount){
		double calculateDiscount = discountStrategy.calculateDiscount(amount);
		System.out.println("Original Amount: ₹ "+amount);
		System.out.println("Discount Applied: ₹ "+calculateDiscount);
		System.out.println("Final Payable Amount: ₹ "+(amount-calculateDiscount));
	}

}
