package com.springcore.beanscope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("helloWorld")
@Scope("singleton")
public class HelloWorld {
    @Value("Mohit")
    private String name;

}
