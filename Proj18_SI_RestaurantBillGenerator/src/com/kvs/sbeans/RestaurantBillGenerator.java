package com.kvs.sbeans;


public class RestaurantBillGenerator {
	double foodAmount;
	double drinksAmount;
	double serviceCharge;
	double gstPercentage;
	
	public void setFoodAmount(double foodAmount) {
		this.foodAmount = foodAmount;
	}
	public void setDrinksAmount(double drinksAmount) {
		this.drinksAmount = drinksAmount;
	}
	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
	public void setGstPercentage(double gstPercentage) {
		this.gstPercentage = gstPercentage;
	}
	
	public double generateFinalBill() {
		double baseAmount = foodAmount + drinksAmount + serviceCharge;
		double 	gst = baseAmount * gstPercentage / 100;
		double	finalBill = baseAmount + gst;
		return finalBill;

	}
	


}
