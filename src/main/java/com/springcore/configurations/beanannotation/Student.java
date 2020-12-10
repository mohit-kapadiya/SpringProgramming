package com.springcore.configurations.beanannotation;

import org.springframework.beans.factory.annotation.Value;

public class Student {
    @Value("Mohit")
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
