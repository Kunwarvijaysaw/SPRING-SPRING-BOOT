package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbeans.DiscountCalculate;

public class DiscountCalculatorMain {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/kvs/cfgs/applicationContext.xml");
		DiscountCalculate dc=(DiscountCalculate)ctx.getBean("discountCalculate");
		System.out.println(dc.calculateDiscount());

	}

}
