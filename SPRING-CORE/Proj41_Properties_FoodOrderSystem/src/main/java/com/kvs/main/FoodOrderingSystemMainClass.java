package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.FoodDetails;

public class FoodOrderingSystemMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		FoodDetails foodDetails=ctx.getBean(FoodDetails.class);
		System.out.println(foodDetails);

	}

}
