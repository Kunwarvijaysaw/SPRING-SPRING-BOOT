package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("carService")
public class CarMaintenanceService implements MaintenanceService {

	@Override
	public void performService() {
		System.out.println("Car service Done......");
		
	}

}
