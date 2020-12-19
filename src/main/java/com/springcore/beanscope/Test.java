package com.springcore.beanscope;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:scope.xml");
        HelloWorld helloWorld=(HelloWorld) context.getBean("helloWorld");
        logger.info(helloWorld.hashCode());
        logger.info(helloWorld.hashCode());

        logger.info(helloWorld.hashCode());
        logger.info(helloWorld.hashCode());

        logger.info(helloWorld.hashCode());

        logger.info(helloWorld.hashCode());




    }


}
