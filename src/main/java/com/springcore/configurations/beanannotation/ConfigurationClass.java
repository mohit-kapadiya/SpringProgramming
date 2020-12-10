package com.springcore.configurations.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springcore.configurations.beanannotation")
public class ConfigurationClass {
    @Bean(name = "studentBean")
    public Student student(){
      return   new Student();
    }
}
