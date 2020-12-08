package com.springcore.refrences.ref2;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:configrefrences.xml");
        Employee employee=(Employee)context.getBean("employee2");
        employee.display();

    }
}
