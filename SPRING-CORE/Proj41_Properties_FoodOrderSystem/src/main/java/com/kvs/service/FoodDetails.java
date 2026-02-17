package com.kvs.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FoodDetails {
	
	@Value("${food.id}")
	private String foodId;
	@Value("${food.name}")
	private String foodName;
	@Value("food.${preparationTime}")
	private String preparationTime;
	@Value("${restaurant.name}")
	private String restaurantName;
	
	@Override
	public String toString() {
		return "FoodDetails [foodId=" + foodId + ", foodName=" + foodName + ", preparationTime=" + preparationTime
				+ ", restaurantName=" + restaurantName + "]";
	}

	

}
