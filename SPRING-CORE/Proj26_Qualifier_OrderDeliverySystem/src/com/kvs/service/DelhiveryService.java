package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("delhivery")
public class DelhiveryService implements DeliveryService {

	@Override
	public void deliverOrder() {
		System.out.println("Delivery Service................!");
		
	}

}
