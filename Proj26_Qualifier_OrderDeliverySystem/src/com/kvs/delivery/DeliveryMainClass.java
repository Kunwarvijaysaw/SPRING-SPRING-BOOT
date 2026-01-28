package com.kvs.delivery;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.OrderManager;

public class DeliveryMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		OrderManager order=ctx.getBean(OrderManager.class);
		order.deliveryDetails();

	}

}
