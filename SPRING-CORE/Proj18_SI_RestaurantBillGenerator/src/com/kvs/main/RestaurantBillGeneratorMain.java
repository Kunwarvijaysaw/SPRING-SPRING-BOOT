/*Q2) RestaurantBillGenerator (Setter Injection)
Scenario
A restaurant generates the final customer bill depending on:
Food Amount
Drinks Amount
Service Charge
GST Percentage
This is best suited for Setter Injection because the restaurant might update values later (like GST, service charge, etc.)

Class: RestaurantBillGenerator
Fields
double foodAmount → cost of food items
double drinksAmount → cost of beverages
double serviceCharge → fixed service charge
double gstPercentage → GST % applied

Setter Methods
setFoodAmount()
setDrinksAmount()
setServiceCharge()
setGstPercentage()

Method : double generateFinalBill()

Logic
baseAmount = foodAmount + drinksAmount + serviceCharge
gst = baseAmount * gstPercentage / 100
finalBill = baseAmount + gst

AppConfig (Java Config)

In AppConfig, create RestaurantBillGenerator bean
Set values using setter methods inside AppConfig

Input
-----
foodAmount = 800
drinksAmount = 200
serviceCharge = 50
gstPercentage = 18

Output
-------
Final Restaurant Bill: ₹1239.0
*/

package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.cfgs.AppConfig;
import com.kvs.sbeans.RestaurantBillGenerator;

public class RestaurantBillGeneratorMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		RestaurantBillGenerator res=(RestaurantBillGenerator)ctx.getBean("rObj",RestaurantBillGenerator.class);
		res.setDrinksAmount(200);
		res.setFoodAmount(800);
		res.setServiceCharge(50);
		res.setGstPercentage(18);
		System.out.println("Final Bill: "+res.generateFinalBill());

	}

}
