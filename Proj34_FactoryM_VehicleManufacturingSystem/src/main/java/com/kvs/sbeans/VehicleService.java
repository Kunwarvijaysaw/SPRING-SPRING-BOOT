package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
	@Autowired
   VehicleFactory vechFactory;
	

public String createVehicle(String type, String engineType){
	Vehicle vehicle = vechFactory.createVehicle(type, engineType);
	String description = vehicle.getDescription();
	return description;
	
}
}
