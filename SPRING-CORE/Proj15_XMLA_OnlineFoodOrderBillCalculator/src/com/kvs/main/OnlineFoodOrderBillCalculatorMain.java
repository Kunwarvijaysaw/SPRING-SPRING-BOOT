package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbeans.OnlineFoodOrderBillCalculator;

public class OnlineFoodOrderBillCalculatorMain {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx= new FileSystemXmlApplicationContext("src/com/kvs/cfgs/applicationContext.xml");
		OnlineFoodOrderBillCalculator foodBill=(OnlineFoodOrderBillCalculator)ctx.getBean("fob");
		foodBill.setFoodCost(450);
		foodBill.setDeliveryCharge(50);
		foodBill.setDiscountPercentage(10);
		System.out.println("Final Food Bill :Rs "+foodBill.generateBill());

	}

}
