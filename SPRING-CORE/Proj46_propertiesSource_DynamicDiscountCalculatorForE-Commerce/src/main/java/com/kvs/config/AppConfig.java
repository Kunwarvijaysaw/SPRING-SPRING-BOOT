package com.kvs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.kvs.service")
@PropertySource("com/kvs/properties/discount.properties")
public class AppConfig {

}
