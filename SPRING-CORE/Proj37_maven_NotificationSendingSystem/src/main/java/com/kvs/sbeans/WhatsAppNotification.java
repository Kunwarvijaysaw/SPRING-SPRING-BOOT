package com.kvs.sbeans;

import org.springframework.stereotype.Component;

@Component("wp")
public class WhatsAppNotification implements NotificationStrategy{

	@Override
	public void send(String message) {
		System.out.println("Wasapp : "+message);
		
	}

}
