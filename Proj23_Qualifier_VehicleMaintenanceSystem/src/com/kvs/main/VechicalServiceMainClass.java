package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.MaintenanceService;
import com.kvs.service.VehicleWorkshop;

public class VechicalServiceMainClass {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		VehicleWorkshop shop=ctx.getBean(VehicleWorkshop.class);
		shop.vechicalService();

	}

}
