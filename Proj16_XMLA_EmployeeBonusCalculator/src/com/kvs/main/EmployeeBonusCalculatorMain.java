package com.kvs.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.kvs.sbeans.EmployeeBonusCalculator;

public class EmployeeBonusCalculatorMain {

	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx =new FileSystemXmlApplicationContext("src/com/kvs/cfgs/applicationContext.xml");
		EmployeeBonusCalculator bonus=(EmployeeBonusCalculator)ctx.getBean("ebc");
		bonus.setEmployeeSalary(50000);
		bonus.setBonusPercentage(15);
		
		System.out.println("Final Salary : Rs "+bonus.calculateBonus());

	}

}
