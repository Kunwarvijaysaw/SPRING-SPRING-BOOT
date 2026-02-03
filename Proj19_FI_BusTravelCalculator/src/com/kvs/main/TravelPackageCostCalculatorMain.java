/*Q3) TravelPackageCostCalculator (Field Injection)
Scenario
A travel agency calculates travel package cost based on package details such as:
Package Cost
Number of Travelers
Discount Percentage

Here, one class stores Package Details and another class calculates final bill.
This is best suited for Field Injection (@Autowired) because the calculator depends on package details automatically.

Class: PackageDetails

Fields
double packageCostPerPerson → cost for 1 person
int numberOfTravelers → how many people are traveling
double discountPercentage → discount given on total

This class only stores values and provides them to the calculator.

Class: TravelPackageCostCalculator
Field
@Autowired PackageDetails packageDetails
Means TravelPackageCostCalculator automatically gets PackageDetails object.

Method : double calculateFinalPackageCost()

Logic
total = packageCostPerPerson * numberOfTravelers
discount = total * discountPercentage / 100
finalCost = total - discount

AppConfig (Java Config)

Enable Component Scan in AppConfig
Spring automatically creates both PackageDetails and TravelPackageCostCalculator objects

Input

packageCostPerPerson = 5000
numberOfTravelers = 4
discountPercentage = 10

Output
Final Package Cost: ₹18000.0
*/

package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.cfgs.AppConfig;
import com.kvs.sbeans.TravelPackageCostCalculator;

public class TravelPackageCostCalculatorMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		TravelPackageCostCalculator calculatorMain = ctx.getBean(TravelPackageCostCalculator.class);
		double calculateFinalPackageCost = calculatorMain.calculateFinalPackageCost();
		System.out.println(calculateFinalPackageCost);
	}

}
