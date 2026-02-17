package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbeans.BillGenerator;

public class BillGeneratorMain {

	public static void main(String[] args) {
		
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/kvs/cfgs/applicationContext.xml");
		
		BillGenerator bg=(BillGenerator) ctx.getBean("billGenerator");
		System.out.println(bg.generateBill());
	}

}
