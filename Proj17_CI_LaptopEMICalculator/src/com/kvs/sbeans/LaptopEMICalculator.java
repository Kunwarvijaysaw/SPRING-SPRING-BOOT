package com.kvs.sbeans;

import org.springframework.stereotype.Component;

public class LaptopEMICalculator {
	double laptopPrice;
	double downPayment;
	int emiMonths;
	
	
	
	public LaptopEMICalculator(double laptopPrice, double downPayment, int emiMonths) {
		super();
		this.laptopPrice = laptopPrice;
		this.downPayment = downPayment;
		this.emiMonths = emiMonths;
	}

	public double calculateMonthlyEMI() {
		double remainingAmount = laptopPrice - downPayment;
		double monthlyEMI = remainingAmount / emiMonths;
		return monthlyEMI;

	}


}
