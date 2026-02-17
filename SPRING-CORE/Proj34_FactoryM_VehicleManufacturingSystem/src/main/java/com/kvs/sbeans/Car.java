package com.kvs.sbeans;

public class Car implements Vehicle {
	Engine engineType;
	int doors;
	
	public Car(Engine engineType, int doors) {
		super();
		this.engineType = engineType;
		this.doors = doors;
	}



	@Override
	public String getDescription() {
		return "Car with " + engineType.getEngineType() + " engine and " + doors + " doors";
	}

}
