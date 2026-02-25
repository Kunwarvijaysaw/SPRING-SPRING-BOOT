package com.kvs.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.kvs.main.model.Vehicle;

@Service
@Profile("car")
public class CarService implements VehicleService {

	@Override
    public List<Vehicle> getVehicles() {
        return Arrays.asList(
                new Vehicle(1, "Swift", "Car"),
                new Vehicle(2, "Innova", "Car")
        );
    }

}
