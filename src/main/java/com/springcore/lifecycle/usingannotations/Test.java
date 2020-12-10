package com.springcore.lifecycle.usingannotations;

import org.apache.log4j.Logger;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("classpath:lifecycle.xml");
        User user=context.getBean("user",User.class);
        context.registerShutdownHook();
        logger.info(user);
    }
}
