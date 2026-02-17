package com.kvs.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kvs.sbeans.PackageDetails;
@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {
	
	@Bean
	public PackageDetails packageDetails() {
		PackageDetails details=new PackageDetails();
		details.discountPercentage=10;
		details.numberOfTravelers=4;
		details.packageCostPerPerson=5000;
		return details;
		
	}

}
