package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.cfgs.AppConfig;
import com.kvs.sbeans.LaptopEMICalculator;

public class LaptopEMICalculatorMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		LaptopEMICalculator l=(LaptopEMICalculator) ctx.getBean("lec");
		System.out.println(l.calculateMonthlyEMI());

	}

}
