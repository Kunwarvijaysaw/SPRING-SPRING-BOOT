package com.kvs.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kvs.sbeans.LaptopEMICalculator;

@Configuration
@ComponentScan(basePackages = "com.kvs.sbeans")
public class AppConfig {
	
	@Bean("lec")
	public LaptopEMICalculator getLaptopEMICalculator() {
		return new LaptopEMICalculator(60000.0,10000.0, 10);
	}

}
