package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component
public class MeterReading {
	
	private int unitsConsumed;
	private int costPerUnit;
	
	public int getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(int unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	public int getCostPerUnit() {
		return costPerUnit;
	}
	public void setCostPerUnit(int costPerUnit) {
		this.costPerUnit = costPerUnit;
	}
	
}
