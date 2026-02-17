package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.sbeans.ElectricityBillingSystem;

public class EBCS_MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ElectricityBillingSystem bill=ctx.getBean(ElectricityBillingSystem.class);
		bill.showBill(250);
	}

}
