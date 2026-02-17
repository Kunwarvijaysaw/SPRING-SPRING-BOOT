package com.kvs.main;

import java.util.Locale;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;

public class MainClass 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        String lang = "hi";
		Locale locale = new Locale(lang);
        String msg = ctx.getMessage("greet.msg", new Object[] {}, locale);
        System.out.println(msg);
    }
}
