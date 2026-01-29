package com.kvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LaptopService {
	
	@Autowired
	Laptop laptop;
	
	public void printLaptopDetails() {
		System.out.println("Laptop Brand: "+laptop.brand +
							"\nProcessor: "+laptop.processor+
							"\nRAM: "+laptop.ram);
	}

	
	

}
