package com.springcore.constructorinjection.collections;

import org.apache.log4j.Logger;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Collections {
    public static final Logger logger = Logger.getLogger(Collections.class);
    private List<String> name;
    private Set<String> city;
    private Map<Integer,String> data;
    private Properties properties;

    public Collections(List<String> name, Set<String> city, Map<Integer, String> data, Properties properties) {
        this.name = name;
        this.city = city;
        this.data = data;
        this.properties = properties;
    }
    public void display(){
        logger.info("name info "+name);
        logger.info("city info "+city);
        logger.info("data info "+data);
        logger.info("properties info"+properties);
    }
}
