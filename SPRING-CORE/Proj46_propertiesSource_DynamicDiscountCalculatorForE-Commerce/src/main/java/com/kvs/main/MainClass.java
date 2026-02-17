package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.DiscountService;

public class MainClass 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        DiscountService service=ctx.getBean(DiscountService.class);
        service.getDiscount("regular",2000 );
        service.getDiscount("premium",2000 );
        service.getDiscount("vip",2000 );
    }
}
