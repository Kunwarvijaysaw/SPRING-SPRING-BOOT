package com.kvs.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.kvs")

@PropertySource("com/kvs/properties/payment.properties")
public class AppConfig {

}
