package com.springcore.setterinjection.collections;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:config.xml");
        CollectionsType collectionsType = (CollectionsType) context.getBean("collections");
        logger.info(collectionsType.getId());
        logger.info(collectionsType.getName());
        logger.info(collectionsType.getSubject());
        logger.info(collectionsType.getProperties());
    }
}
