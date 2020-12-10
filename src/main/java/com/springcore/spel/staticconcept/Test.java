package com.springcore.spel.staticconcept;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:seterotypeanno.xml");
        StaticConcept staticConcept=(StaticConcept) context.getBean("staticConcept");
        logger.info(staticConcept);

    }
}
