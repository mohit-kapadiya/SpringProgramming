package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("expressionlanguage")
public class ExpressionLanguage {
    @Value("#{(2+2)*2+9}")
    private double arithmetic;
    @Value("#{1 le 2}")
    private boolean lessthan;
    @Value("#{1>2 || 2<3}")
    private boolean or;
    @Value("#{2>1 ? 'a':'b'}")
    private String ternary;
    @Value("#{'100' matches '\\d+'}")
    private boolean validNumber;

    @Override
    public String toString() {
        return "ExpressionLanguage{" +
                "arithmetic=" + arithmetic +
                ", lessthan=" + lessthan +
                ", or=" + or +
                ", ternary='" + ternary + '\'' +
                ", validNumber=" + validNumber +
                '}';
    }
}
