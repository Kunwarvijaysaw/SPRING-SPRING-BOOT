package com.kvs.sbeans;

public class MotorCycle implements Vehicle {
	Engine engineType;
	boolean sidecar;

	public MotorCycle(Engine engineType, boolean sidecar) {
		super();
		this.engineType = engineType;
		this.sidecar = sidecar;
	}

	@Override
	public String getDescription() {
		return "Motorcycle with " + engineType.getEngineType()+ " engine and sidecar: " + sidecar;
	}

}
