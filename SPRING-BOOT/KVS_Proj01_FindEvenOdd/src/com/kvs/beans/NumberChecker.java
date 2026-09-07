package com.kvs.beans;

public class NumberChecker {

    private int number;

    public NumberChecker() {
        System.out.println("NumberChecker object created...");
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void checkNumber() {

        if (number % 2 == 0)
            System.out.println(number + " is Even Number");
        else
            System.out.println(number + " is Odd Number");
    }
}