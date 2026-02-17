package com.kvs.main;

import java.security.Provider.Service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.LaptopService;

public class PrinterMainClass {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		LaptopService service=ctx.getBean(LaptopService.class);
		service.printLaptopDetails();
	}

}
