package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.employee.SalarySlipService;

public class EmployeeSalaryMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		SalarySlipService salary=ctx.getBean(SalarySlipService.class);
		salary.generateSlip();

	}

}
