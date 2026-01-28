package com.kvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleWorkshop {
	
	MaintenanceService maintenanceService;
	
	@ Autowired
	public VehicleWorkshop(@Qualifier("carService") MaintenanceService maintenanceService) {
		super();
		this.maintenanceService = maintenanceService;
	}
	
	public void vechicalService() {
		maintenanceService.performService();
	}

}
