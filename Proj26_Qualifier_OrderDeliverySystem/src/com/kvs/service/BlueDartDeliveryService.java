package com.kvs.service;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDartDeliveryService implements DeliveryService {

	@Override
	public void deliverOrder() {
		System.out.println("BlueDart Service.........!");
		
	}

}
