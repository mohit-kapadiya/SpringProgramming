package com.springcore.constructorinjection.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:constructorconfig.xml");
        Collections collections=(Collections) context.getBean("collections");
        collections.display();
    }
}
