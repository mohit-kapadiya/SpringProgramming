package reflectionapi.getclassinfo;

import org.apache.log4j.Logger;

import java.io.Serializable;
import java.lang.reflect.Modifier;

public class Employee implements Serializable,Cloneable {

}
 class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args)  throws Exception{
       Employee employee=new Employee();
       Class classes=employee.getClass();
       logger.info("Class Name   "+classes.getName());
       logger.info("Super class Name  "+classes.getSuperclass().getName());
       Class[] cl=classes.getInterfaces();
       for(Class interfaces:cl){
           logger.info(interfaces.getName());
       }
       int i=classes.getModifiers();
       logger.info("Modifiers are :"+ Modifier.toString(i));
    }
}

