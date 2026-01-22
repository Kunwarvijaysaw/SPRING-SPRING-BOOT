package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("csb")

public class CarServiceBillGenerator {
	double serviceCharge;
	double partsCost;
	double gstPercentage;
	
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public void setPartsCost(double partsCost) {
		this.partsCost = partsCost;
	}
	public void setGstPercentage(double gstPercentage) {
		this.gstPercentage = gstPercentage;
	}
	
	public double generateFinalBill() {
		double base = serviceCharge + partsCost;
		double gst = (base * gstPercentage / 100);
		double total = base + gst;
		return total;

	}


}
