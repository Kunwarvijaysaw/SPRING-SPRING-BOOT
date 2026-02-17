package com.kvs.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
	
	@Autowired
	@Qualifier("wp")
	NotificationStrategy notification;
	
	public void notifyUser(String message){
		notification.send(message);
	}
}
