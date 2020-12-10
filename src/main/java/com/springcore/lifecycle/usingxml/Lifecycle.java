package com.springcore.lifecycle.usingxml;

import org.apache.log4j.Logger;

public class Lifecycle {
    public static final Logger logger = Logger.getLogger(Lifecycle.class);
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        logger.info("this is a setter method");
        this.name = name;
    }
    public void init(){
        logger.info("this is a init method");

    }

    public void destroy(){
        logger.info("this is a destroy method");
    }

    @Override
    public String toString() {
        return "Lifecycle{" +
                "name='" + name + '\'' +
                '}';
    }

}
