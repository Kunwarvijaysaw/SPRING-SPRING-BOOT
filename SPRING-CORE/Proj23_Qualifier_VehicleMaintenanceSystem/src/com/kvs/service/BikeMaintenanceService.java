package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("bikeService")
public class BikeMaintenanceService implements MaintenanceService {

	@Override
	public void performService() {
		System.out.println("Bike Maintenance");
		
	}

}
