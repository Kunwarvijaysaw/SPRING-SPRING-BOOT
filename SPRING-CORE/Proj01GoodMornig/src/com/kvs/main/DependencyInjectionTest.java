package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[]args) {
		// Create Application IOC container
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/kvs/cfgs/application.xml");
		
		//get Target spring bean class obj ref
		Object bean = ctx.getBean("wmg");
		
		//type casting
		WishMessageGenerator generator=(WishMessageGenerator)bean;
		//invoke the b.method
		String msg=generator.generateWishMessage("KVS...");
		System.out.println(msg);
		ctx.close();
	}

}
