package com.springcore.lifecycle.usingannotations;

import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User {
    public static final Logger logger = Logger.getLogger(User.class);
    private String city;

    public static Logger getLogger() {
        return logger;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "city='" + city + '\'' +
                '}';
    }

    @PostConstruct
    public void start(){
        logger.info("this is a start method");
    }

    @PreDestroy
    public void end(){
        logger.info("this is a end method");
    }

}
