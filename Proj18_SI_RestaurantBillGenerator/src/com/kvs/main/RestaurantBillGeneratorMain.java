package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.cfgs.AppConfig;
import com.kvs.sbeans.RestaurantBillGenerator;

public class RestaurantBillGeneratorMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		RestaurantBillGenerator res=(RestaurantBillGenerator)ctx.getBean("rbg");
		System.out.println(res.generateFinalBill());

	}

}
