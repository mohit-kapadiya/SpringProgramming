package com.springcore.spel.staticconcept;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("staticConcept")
public class StaticConcept {
    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double Z;
    @Value("#{T(java.lang.Math).E}")
    private double e;
    @Value("#{new java.lang.String('Mohit')}")
    private String name;

    @Override
    public String toString() {
        return "StaticConcept{" +
                "Z=" + Z +
                ", e=" + e +
                ", name='" + name + '\'' +
                '}';
    }
}
