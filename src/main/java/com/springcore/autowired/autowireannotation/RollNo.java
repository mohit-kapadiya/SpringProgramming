package com.springcore.autowired.autowireannotation;

public class RollNo {
    private int rollNo;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "RollNo{" +
                "rollNo=" + rollNo +
                '}';
    }
}
