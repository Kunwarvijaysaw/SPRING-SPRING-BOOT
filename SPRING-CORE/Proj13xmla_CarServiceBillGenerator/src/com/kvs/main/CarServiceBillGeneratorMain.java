/*Q2) CarServiceBillGenerator
Scenario
A car service center generates the total service bill using service charge, parts cost, and GST percentage.
Class : CarServiceBillGenerator

Fields
double serviceCharge
double partsCost
double gstPercentage

Constructor Accept all 3 values

Method : double generateFinalBill()

Logic
base = serviceCharge + partsCost
gst = (base * gstPercentage / 100)
total = base + gst

Input
serviceCharge = 1200
partsCost = 1800
gstPercentage = 18

Output

Final Service Bill: ₹3540.0
*/

package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbeans.CarServiceBillGenerator;

public class CarServiceBillGeneratorMain {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx=new FileSystemXmlApplicationContext("src/com/kvs/cfgs/applicationContext.xml");
		
		CarServiceBillGenerator csbg=(CarServiceBillGenerator) ctx.getBean("csb");
		csbg.setGstPercentage(18);
		csbg.setServiceCharge(1200);
		csbg.setPartsCost(1800);
		System.out.println("Total Car Service Bill: ₹"+csbg.generateFinalBill());
	}

}
