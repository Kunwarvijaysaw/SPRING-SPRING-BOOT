package com.kvs.main;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.kvs.ComponentClass.SeasonService;

@SpringBootApplication
@ComponentScan(basePackages = "com.kvs")
public class SeasonFinder {
   @Bean("ld")
	public LocalDateTime getdate() {
		return LocalDateTime.now();
	}
	
	
	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(SeasonFinder.class, args);
		
		SeasonService bean = run.getBean(SeasonService.class);
		System.out.println(bean.getSeason());
	}

}
