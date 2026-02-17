package com.kvs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderManager {
	
	DeliveryService deliveryService;

	@Autowired
	public void setDeliveryService(@Qualifier("delhivery") DeliveryService deliveryService) {
		this.deliveryService = deliveryService;
	}
	
	
	public void deliveryDetails() {
		deliveryService.deliverOrder();
	}


	

}
