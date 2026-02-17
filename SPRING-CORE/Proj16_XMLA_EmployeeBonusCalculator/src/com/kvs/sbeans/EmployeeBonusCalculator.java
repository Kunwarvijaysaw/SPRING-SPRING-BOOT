/*Q5) EmployeeBonusCalculator
Scenario
A company calculates employee bonus based on salary and bonus percentage.

Class : EmployeeBonusCalculator
 
Fields
double employeeSalary;
double bonusPercentage;

Constructor : Accept both values

Method : double calculateBonus()

Logic
bonus = employeeSalary * bonusPercentage / 100

Input
employeeSalary = 50000
bonusPercentage = 15

Output : Employee Bonus: ₹7500.0

*/

package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("ebc")
public class EmployeeBonusCalculator {
	double employeeSalary;
	double bonusPercentage;
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public void setBonusPercentage(double bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	
	
	public double calculateBonus() {
		return employeeSalary * bonusPercentage / 100;
	}

}
