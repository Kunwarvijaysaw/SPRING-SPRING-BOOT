package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.sbeans.TransactionService;

public class BankMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		TransactionService  t1=ctx.getBean(TransactionService.class);
		t1.processTransaction("deposite", 12000);
		
		
		TransactionService t2 =ctx.getBean(TransactionService.class);
		t2.processTransaction("deposite", 12000);
		
		
		System.out.println(t1 == t2);
		
		
		
		
	}

}
