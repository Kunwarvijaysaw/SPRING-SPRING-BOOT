package com.kvs.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.kvs.sbeans.Processor;   

@Configuration
@ComponentScan(basePackages = "com.kvs.sbeans")
public class AppConfig {

    @Bean
    public Processor getProcessor() {
//        return new Processor("12");   // Constructor injection
    	Processor p = new Processor();
        p.setRam("16");   // Setting value using setter
        return p;
    }
}
