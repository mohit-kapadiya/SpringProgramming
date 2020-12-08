package reflectionapi.getmethodinfo;

import org.apache.log4j.Logger;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test {
    public static final Logger logger = Logger.getLogger(Test.class);
    public static void main(String[] args) throws Exception{
        Student student=new Student();
        Class classes=student.getClass();
        logger.info("Name is "+classes.getName());
        Method[] methods=classes.getDeclaredMethods();
        for(Method method:methods){
            logger.info(method);
            logger.info(method.getReturnType());
            int i=method.getModifiers();
            logger.info("Modifiers are "+ Modifier.toString(i));
            Class[] class1=method.getParameterTypes();
            for(Class class2:class1){
                logger.info("parameters type are "+class2.getName());
            }
            Class[] class2=method.getExceptionTypes();
            for(Class class3:class2){
                logger.info("Exception type are "+class3.getName());
            }

        }

    }
}
