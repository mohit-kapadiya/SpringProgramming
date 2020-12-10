package reflectionapi;

import javax.annotation.Resource;
import java.lang.annotation.Annotation;

@Resource(name="foo",description = "bar")
public class FindAnnotataions {
    public static void main(String[] args) {
        for(Annotation annotation : FindAnnotataions.class.getAnnotations()){
            Class<? extends Annotation> type=annotation.annotationType();
            System.out.println("value of"+type.getName());
        }
    }

}
