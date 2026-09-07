package com.kvs.main;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kvs.sbeans.NumberChecker;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/kvs/cfgs/applicationContext.xml");

        NumberChecker obj = context.getBean("checker", NumberChecker.class);

        obj.checkNumber();

        ((ClassPathXmlApplicationContext)context).close();

    }

}