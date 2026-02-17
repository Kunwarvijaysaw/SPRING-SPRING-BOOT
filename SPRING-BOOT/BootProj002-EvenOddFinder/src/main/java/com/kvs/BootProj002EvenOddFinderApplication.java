package com.kvs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.kvs.service.NumberService;

@SpringBootApplication
public class BootProj002EvenOddFinderApplication {
	@Autowired
    private NumberService numberService;
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj002EvenOddFinderApplication.class, args);
		NumberService service = ctx.getBean(NumberService.class);
		System.out.println("Number : "+service.checkEvenOdd(5));
	}

}
