package com.kvs.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DiscountCalculate {
	private LocalDate localDate;
	private double price;
	
	
	public double calculateDiscount() {
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		if(dayOfWeek.equals("Monday")||dayOfWeek.equals("Tuesday")||dayOfWeek.equals("Wednesday")) {
			return price*0.10;
		}else {
			return price*0.20;
		}
	}


	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	

}
