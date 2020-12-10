package com.springcore.seterotypeannotation;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:seterotypeanno.xml");
        Student student=context.getBean("student",Student.class);
        logger.info(student);
    }


}
