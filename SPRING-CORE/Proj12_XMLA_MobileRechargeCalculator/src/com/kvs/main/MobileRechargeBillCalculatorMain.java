package com.kvs.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbean.MobileRechargeBillCalculator;

public class MobileRechargeBillCalculatorMain {

	
	    public static void main(String[] args) {

	        FileSystemXmlApplicationContext ctx =
	                new FileSystemXmlApplicationContext("src/com/kvs/cfgs/applicationContext.xml");

	        MobileRechargeBillCalculator mbc =	 (MobileRechargeBillCalculator) ctx.getBean("mbc");

	        System.out.println("Total Recharge Bill: ₹" + mbc.generateRechargeBill());
	    }
	}


