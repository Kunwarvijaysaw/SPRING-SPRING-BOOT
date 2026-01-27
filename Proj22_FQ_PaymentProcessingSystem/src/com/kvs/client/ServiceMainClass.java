package com.kvs.client;

import java.io.ObjectInputFilter.Config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.PaymentProcessor;

public class ServiceMainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		PaymentProcessor processor=ctx.getBean(PaymentProcessor.class);
		processor.makePayment();
		}

}
