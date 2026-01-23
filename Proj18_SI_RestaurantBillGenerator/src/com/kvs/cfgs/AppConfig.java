package com.kvs.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kvs.sbeans.RestaurantBillGenerator;

@Configuration
@ComponentScan(basePackages = "com.kvs.sbeans")
public class AppConfig {

	@Bean("rObj")
	public RestaurantBillGenerator getRestaurantBillGenerator()
	{
		RestaurantBillGenerator rbg = new RestaurantBillGenerator();
//		rbg.setDrinksAmount(200);
//		rbg.setFoodAmount(800);
//		rbg.setServiceCharge(50);
//		rbg.setGstPercentage(18);
		return rbg;
	}

}
