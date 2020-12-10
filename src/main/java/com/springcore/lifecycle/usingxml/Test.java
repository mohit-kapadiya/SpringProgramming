package com.springcore.lifecycle.usingxml;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Lifecycle.class);
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("classpath:lifecycle.xml");
        Lifecycle lifecycle=context.getBean("lifecycle",Lifecycle.class);
        context.registerShutdownHook();
        logger.info(lifecycle);
    }
}
