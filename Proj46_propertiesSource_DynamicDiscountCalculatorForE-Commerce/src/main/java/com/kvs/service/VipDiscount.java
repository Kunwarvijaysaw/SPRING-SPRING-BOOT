package com.kvs.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("vip")
public class VipDiscount implements DiscountStrategy {

	@Value("${discount.vip.flat}")
	private double flat;
	@Value("${discount.vip.percentage}")
	private double percentage;
	@Override
	public double calculateDiscount(double amount) {
		
		return amount*(percentage/100.0)+flat;
	}
}
