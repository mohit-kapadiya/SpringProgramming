package com.springcore.autowired.byconstructor;

public class User {
    private String name;
    private Id id;

    public User(String name, Id id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
