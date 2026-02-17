package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbeans.WeekDayGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//Create Application IOC Container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/kvs/cfgs/application.xml");
		
		//get Traget Spring bean class obj ref
		Object obj = ctx.getBean("wkdf");
		
		WeekDayGenerator generator=(WeekDayGenerator)obj;
		//invoke the b.method
		String msg=generator.generateWeekDay("Amazing.......!");
		System.out.println(msg);
		ctx.close();
		

	}
 
}
