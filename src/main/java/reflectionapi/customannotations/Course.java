package reflectionapi.customannotations;

import java.lang.annotation.*;


@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Course{
        String id() default "110";
        String name() default "mohit";
        int cost() default 50000;
}

