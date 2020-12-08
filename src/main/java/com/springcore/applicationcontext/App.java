package com.springcore.applicationcontext;

import com.springcore.applicationcontext.Student;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static final Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:config.xml");
        Student student=(Student) context.getBean("student");
        logger.info(student);
    }
}
