package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbean.TicketBillCalculator;

public class TicketMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	    TicketBillCalculator bean = ctx.getBean(TicketBillCalculator.class);
	    System.out.println("Total Ticket Amount ="+bean.calculateTotalAmount());
	}
}
