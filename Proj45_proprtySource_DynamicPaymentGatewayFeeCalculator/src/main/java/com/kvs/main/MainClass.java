package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.PaymentService;

public class MainClass 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	PaymentService bean = ctx.getBean(PaymentService.class);
    	bean.getPaymentFee("credit", 1000);
    	bean.getPaymentFee("debit", 1000);
    	bean.getPaymentFee("upi", 1000);
    }
}
