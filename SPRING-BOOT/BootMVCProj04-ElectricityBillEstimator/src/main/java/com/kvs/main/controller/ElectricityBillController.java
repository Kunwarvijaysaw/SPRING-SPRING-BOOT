package com.kvs.main.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.kvs.main.model.ElectricityBill;

@Controller
public class ElectricityBillController {
	
	@GetMapping("/electricity-bill")
	public String generateBill(Map<String, Object> map) {

	    ElectricityBill bill = new ElectricityBill();
	    bill.setCustomerName("KVS");
	    bill.setUnitsConsumed(120);

	    int units = bill.getUnitsConsumed();
	    double total;

	    if (units < 100) {
	        total = units * 5;
	    } else {
	        total = units * 8;
	    }

	    bill.setTotalBill(total);

	    
	    map.put("data", bill);

	    return "bill-result";
	}
}
