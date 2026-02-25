package com.kvs.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kvs.main.model.Vehicle;
import com.kvs.main.service.VehicleService;

@SpringBootApplication
public class BootProj009ProfileVehicleSystemApplication implements CommandLineRunner {
	
	@Autowired
	VehicleService vehicleService;

	public static void main(String[] args) {
		SpringApplication.run(BootProj009ProfileVehicleSystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		 List<Vehicle> vehicles = vehicleService.getVehicles();

	        System.out.println("===== Vehicle List =====");

	        for (Vehicle v : vehicles) {
	            System.out.println(
	                    v.getId() + " - " +
	                    v.getName() + " - " +
	                    v.getType()
	            );
	        }
	}

}
