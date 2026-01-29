package com.kvs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.kvs.service.Laptop;
import com.kvs.service.LaptopService;

@Configuration
@ComponentScan(basePackages = "com.kvs.service")
public class AppConfig {
	
	@Bean("obj")
	public Laptop getLaptopDetails() {
		return new Laptop("Dell","Intel i7","16GB");
	}

}
