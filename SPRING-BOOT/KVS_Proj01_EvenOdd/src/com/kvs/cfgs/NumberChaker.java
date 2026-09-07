package com.kvs.cfgs;

public class NumberChaker {

	private int num;

	//Setter Injection
	public NumberChaker(int num) {
		this.num = num;
	}
	
	public void checkNumber() {
		if(num%2==0) {
			System.out.println(num + " is Even Number");
		}else {
	            System.out.println(num + " is Odd Number");
		}
	}
}
