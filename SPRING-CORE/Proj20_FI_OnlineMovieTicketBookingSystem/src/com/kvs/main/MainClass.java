package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.sbeans.TicketBillCalculator;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		TicketBillCalculator bean = ctx.getBean(TicketBillCalculator.class);
		double calculateTotalAmount = bean.calculateTotalAmount();
		System.out.println("Total Ticket Amount:"+calculateTotalAmount);
	}
}
