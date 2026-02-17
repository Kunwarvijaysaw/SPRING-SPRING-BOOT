package com.kvs.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiscountService {
	
	@Autowired
	Map<String,DiscountStrategy> map;
	
	public void getDiscount(String type, double amount) {
		double calculateDiscount = map.get(type).calculateDiscount(amount);
	System.out.println(type.toUpperCase()+" Discount : "+calculateDiscount);
	}

}
