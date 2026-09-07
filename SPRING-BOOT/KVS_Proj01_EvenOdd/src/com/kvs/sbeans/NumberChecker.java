package com.kvs.sbeans;

public class NumberChecker {
	private int number;

    public NumberChecker() {
        System.out.println("NumberChecker Object Created");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void checkNumber() {

        if(number % 2 == 0)
            System.out.println(number + " is Even Number");
        else
            System.out.println(number + " is Odd Number");
    }

}
