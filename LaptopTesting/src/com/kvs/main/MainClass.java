package com.kvs.main;

import java.lang.StringTemplate.Processor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.sbeans.Laptop;

public class MainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		Laptop pro=ctx.getBean(Laptop.class);
		pro.compile();

	}

}
