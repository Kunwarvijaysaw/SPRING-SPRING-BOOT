package com.kvs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kvs.service.DiscountService;

@SpringBootApplication
public class BootProj003ProductDiscountCalculatorApplication {
	 
	@Autowired
	DiscountService discountService;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj003ProductDiscountCalculatorApplication.class, args);
		DiscountService service=ctx.getBean(DiscountService.class);
		System.out.println("Final Amount : "+service.applyDiscount(1000, 10));
	}

}
