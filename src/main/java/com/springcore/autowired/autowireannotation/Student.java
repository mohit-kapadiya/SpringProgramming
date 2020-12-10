package com.springcore.autowired.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
public class Student {
    private int id;
    private String name;
    @Autowired
    private  RollNo rollNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RollNo getRollNo() {
        return rollNo;
    }

    public void setRollNo(RollNo rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
