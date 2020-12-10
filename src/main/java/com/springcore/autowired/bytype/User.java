package com.springcore.autowired.bytype;

public class User {
    private String name;
    private Id id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
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
