package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.sbeans.ElectricityBillCalculator;
import com.kvs.sbeans.MeterReading;

public class ElectricBillCalculatorMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		MeterReading reading=ctx.getBean(MeterReading.class);
		reading.setCostPerUnit(350);
		reading.setUnitsConsumed(6);
		
		ElectricityBillCalculator calc=ctx.getBean(ElectricityBillCalculator.class);
		double bill=calc.calculateBill();
		System.out.println("Electricity Bill Amount = ₹" + bill);
	}

}
