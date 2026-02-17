package com.kvs.sbeans;

public class Truck implements Vehicle{
	Engine engineType;
	double payloadCapacity;
	
	
	public Truck(Engine engineType, double payloadCapacity) {
		super();
		this.engineType = engineType;
		this.payloadCapacity = payloadCapacity;
	}


	@Override
	public String getDescription() {
		return "Truck with " + engineType.getEngineType() + " engine and payload capacity " + payloadCapacity + " tons";
	}

}
