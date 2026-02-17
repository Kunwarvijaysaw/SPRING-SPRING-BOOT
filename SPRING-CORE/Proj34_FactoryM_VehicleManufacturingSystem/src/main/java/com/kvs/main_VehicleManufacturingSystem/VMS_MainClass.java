package com.kvs.main_VehicleManufacturingSystem;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.sbeans.VehicleService;

public class VMS_MainClass 
{
    public static void main( String[] args ) {
        
    	AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
    	VehicleService service=ctx.getBean(VehicleService.class);
    	String descrption = service.createVehicle("car", "electric");
  System.out.println(descrption);
    }
}
