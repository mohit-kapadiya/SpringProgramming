package com.springcore.beanfactory;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("classpath:config.xml");
        City city=(City) factory.getBean("city");
        logger.info(city);

    }
}
