package reflectionapi.customannotations;

import org.apache.log4j.Logger;

import java.lang.annotation.Annotation;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) {
        Student student=new Student("111","Uday",20000);
        student.detail();
        Class class1=student.getClass();
        Annotation annotation=class1.getAnnotation(Course.class);
        Course course=(Course) annotation;
        logger.info("******************");
        logger.info("Student course details");
        logger.info("id is "+course.id());
        logger.info("name is "+course.name());
        logger.info("cost is "+course.cost());



    }

}
