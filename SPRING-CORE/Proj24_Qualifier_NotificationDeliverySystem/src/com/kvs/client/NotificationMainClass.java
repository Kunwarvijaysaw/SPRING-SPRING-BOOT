package com.kvs.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.processor.NotificationManager;

public class NotificationMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		NotificationManager notification=ctx.getBean(NotificationManager.class);
		notification.notifyUser();

	}

}
