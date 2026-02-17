/*Q4) OnlineFoodOrderBillCalculator
Scenario
A food delivery app generates bill based on food cost, delivery charge and discount percentage.

Class : OnlineFoodOrderBillCalculator

Fields
double foodCost;
double deliveryCharge;
double discountPercentage;

Constructor : Accept all values

Method
double generateBill()

Logic
total = foodCost + deliveryCharge;
discount = total * discountPercentage / 100;
finalBill = total - discount;

Input
foodCost = 450
deliveryCharge = 50
discountPercentage = 10

Output : Final Food Bill: ₹450.0*/

package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("fob")
public class OnlineFoodOrderBillCalculator {
	double foodCost;
	double deliveryCharge;
	double discountPercentage;
	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}
	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	public void setDiscountPercentage(double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}
	
	public double generateBill() {
		double total = foodCost + deliveryCharge;
		 double discount = total * discountPercentage / 100;
		 double finalBill = total - discount;
		 return finalBill;
		
	}

}
