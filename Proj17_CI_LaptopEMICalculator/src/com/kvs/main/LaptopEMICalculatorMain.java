/*Q1) LaptopEMICalculator (Constructor Injection)

Scenario
A laptop showroom provides EMI facility to customers.
The showroom wants to calculate the monthly EMI based on:

Laptop Price
Down Payment
Total EMI Months

Class: LaptopEMICalculator

Fields
double laptopPrice → Total price of the laptop
double downPayment → Amount paid initially
int emiMonths → Number of months for EMI

Constructor
Accepts:
laptopPrice
downPayment
emiMonths

Method : double calculateMonthlyEMI()

Logic
remainingAmount = laptopPrice - downPayment
monthlyEMI = remainingAmount / emiMonths

AppConfig (Java Config)

In AppConfig, create LaptopEMICalculator bean using constructor values.

Input
------
laptopPrice = 60000
downPayment = 10000
emiMonths = 10

Output
-------
Monthly EMI: ₹5000.0
*/

package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.cfgs.AppConfig;
import com.kvs.sbeans.LaptopEMICalculator;

public class LaptopEMICalculatorMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		LaptopEMICalculator l=(LaptopEMICalculator) ctx.getBean("lec");
		System.out.println(l.calculateMonthlyEMI());

	}

}
