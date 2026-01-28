package com.kvs.generator;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.ReportManager;

public class ReportMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		ReportManager manager=ctx.getBean(ReportManager.class);
		manager.reportGenerator();

	}

}
