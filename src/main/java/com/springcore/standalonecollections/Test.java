package com.springcore.standalonecollections;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:seterotypeanno.xml");
       Employee employee=context.getBean("employee",Employee.class);
       logger.info(employee);

    }
}
