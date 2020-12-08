package reflectionapi.getfieldinfo;

import org.apache.log4j.Logger;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Student {
    public static int enrollmentNumber=110;
    static String name="mohit";
    public static String city="Rajkot";
}
class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) throws IllegalAccessException {
        Student student = new Student();
        Class classes = student.getClass();
        Field[] fields = classes.getFields();
        for (Field field : fields) {
            logger.info("name is   " + field.getName());
            logger.info("Data Type is " + field.getType());
            int i=classes.getModifiers();
            logger.info("Modifiers are "+ Modifier.toString(i));
        }
        System.out.println("**********************************************8");
        Field[] fields2 = classes.getDeclaredFields();
        for (Field field : fields2) {
            logger.info("name is   " + field.getName());
            logger.info("Data Type is " + field.getType());
            int i=classes.getModifiers();
            logger.info("Modifiers are "+ Modifier.toString(i));
            logger.info("values are "+field.get(field));
        }


    }
}
