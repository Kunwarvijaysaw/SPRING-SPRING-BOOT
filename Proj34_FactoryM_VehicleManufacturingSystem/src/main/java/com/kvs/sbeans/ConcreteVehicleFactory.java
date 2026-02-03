package com.kvs.sbeans;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class ConcreteVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle createVehicle(String type, String engineType) {
		Engine engine=null;
		if(engineType.equals("electric")) {
			engine=new ElectricEngine();
		}else if(engineType.equals("diesel")) {
			engine=new DieselEngine();
		}else {
			System.out.println("Invalid Engine Type..........!");
		}
		
		if(type.equalsIgnoreCase("car")) {
			return new Car(engine, 4);
		}else if(type.equalsIgnoreCase("truck")) {
			return new Truck(engine,1000);
		}else if(type.equalsIgnoreCase("motorcycle")) {
			return new MotorCycle(engine,true);
		}else {
			System.out.println("Invalid..........!");
			return null;
		}
		
		
	}

	
}
