package com.kvs.sbeans;

public class BillGenerator {
	private int quantity;
	private double price;
	
	public void setQuantity(int quantity) {
		this.quantity=quantity;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}

	public double generateBill() {
		return quantity*price;
	}
}
