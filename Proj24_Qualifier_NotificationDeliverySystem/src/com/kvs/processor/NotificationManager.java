package com.kvs.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kvs.service.NotificationService;

@Component
public class NotificationManager {
	
	NotificationService notificationService;
	
	@Autowired
	public NotificationManager(@Qualifier("smsService") NotificationService notificationService) {
		super();
		this.notificationService = notificationService;
	}
	
	
	public void notifyUser() {
		notificationService.sendNotification("hello");
	}


}
