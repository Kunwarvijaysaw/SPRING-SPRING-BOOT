package com.kvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class InvoiceService {

	@Autowired
	Product product;
	@Autowired
	TaxCalculator taxCalculator;
	
	public void printInvoice() {
		double total=product.getPrice()*product.getQuntity();
		double tax =taxCalculator.calculateTax(total);
		double 	finalAmount = total + tax;

		System.out.println("Invoice");
		System.out.println("Product: "+product.getName());
		System.out.println("Quantity : "+product.getQuntity());
		System.out.println("Total : "+total);
		System.out.println("Tax : "+tax);
		System.out.println("Final Amount : "+finalAmount);
 

		
	}

	
}
