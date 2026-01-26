package com.kvs.sbeans;


import org.springframework.stereotype.Component;

@Component
public class ElectricityBillCalculator {
	
	MeterReading meterReading;
	
	public int calculateBill() {
		return meterReading.getCostPerUnit()*meterReading.getUnitsConsumed();
	}


}
