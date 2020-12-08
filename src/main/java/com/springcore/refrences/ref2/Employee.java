package com.springcore.refrences.ref2;

import org.apache.log4j.Logger;

import java.util.Iterator;
import java.util.List;

public class Employee {
    public static final Logger logger = Logger.getLogger(Employee.class);
    private int id;
    private List<Address> address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public void display(){
        logger.info(id);
        Iterator<Address> iterator=address.iterator();
        while(iterator.hasNext()){
            logger.info(iterator.next());
        }


    }
}
