package com.kvs.main.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.kvs.main.model.Vehicle;

@Service
@Profile("truck")
public class TruckService implements VehicleService {

	@Override
    public List<Vehicle> getVehicles() {
        return Arrays.asList(
                new Vehicle(1, "Tata Truck", "Truck"),
                new Vehicle(2, "Ashok Leyland", "Truck")
        );
    }

}
