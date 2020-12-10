package com.springcore.lifecycle.usinginterface;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static Logger getLogger() {
        return logger;
    }

    public static final Logger logger = Logger.getLogger(Employee.class);
    @Override
    public void destroy() throws Exception {
        logger.info("this is a destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("this is a init method");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
