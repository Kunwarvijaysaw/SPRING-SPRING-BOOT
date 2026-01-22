package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbean.DatePrinter;

public class DatePrinterMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/kvs/cfgs/applicationContext.xml");
		
		DatePrinter dp = (DatePrinter) ctx.getBean("datePrinter");
		dp.printDate();
	}

}
