package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.congig.AppConfig;
import com.kvs.service.InvoiceService;

public class InvoiceGenerateMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
	InvoiceService invoice=ctx.getBean(InvoiceService.class);
	invoice.printInvoice();

	}

}
