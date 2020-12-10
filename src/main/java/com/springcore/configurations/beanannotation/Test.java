package com.springcore.configurations.beanannotation;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Student student=(Student) context.getBean("studentBean");
        logger.info(student.getName());
    }
}
