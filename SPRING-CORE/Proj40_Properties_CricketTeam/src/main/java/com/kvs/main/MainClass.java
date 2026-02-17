package com.kvs.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kvs.config.AppConfig;
import com.kvs.service.Player;

public class MainClass {
public static void main(String[] args) {
	 AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	 Player player=ctx.getBean(Player.class);
	 System.out.println(player);
}

}
