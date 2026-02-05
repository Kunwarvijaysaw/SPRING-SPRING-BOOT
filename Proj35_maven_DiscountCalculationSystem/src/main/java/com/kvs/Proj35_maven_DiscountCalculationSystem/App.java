package com.kvs.Proj35_maven_DiscountCalculationSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.sbeans.BillingService;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	BillingService obj = ctx.getBean(BillingService.class);
    	obj.generateBill(1000);
    }
}
