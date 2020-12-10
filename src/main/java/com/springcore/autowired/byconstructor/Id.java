package com.springcore.autowired.byconstructor;

public class Id {
    private int id;

    public Id(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Id{" +
                "id=" + id +
                '}';
    }
}
