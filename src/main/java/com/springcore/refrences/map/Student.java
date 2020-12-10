package com.springcore.refrences.map;

import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student {
    public static final Logger logger = Logger.getLogger(Student.class);
    private String name;
    private Map<Subject,City> map;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Subject, City> getMap() {
        return map;
    }

    public void setMap(Map<Subject, City> map) {
        this.map = map;
    }
    public void display(){
        Set<Map.Entry<Subject,City>> set=map.entrySet();
        Iterator<Map.Entry<Subject,City>> iterator=set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Subject,City> entry=iterator.next();
            Subject subject=entry.getKey();
            City city=entry.getValue();
            logger.info("subject info ");
            logger.info(subject);
            logger.info("city info");
            logger.info(city);

        }
    }
}
