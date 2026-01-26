package com.kvs.sbeans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class ElectricityBillCalculator {
	
	
	private MeterReading meterReading;
	
	@Autowired
    public void setMeterReading(MeterReading meterReading) {
        this.meterReading = meterReading;
    }
	public int calculateBill() {
		return meterReading.getCostPerUnit()*meterReading.getUnitsConsumed();
	}


}
