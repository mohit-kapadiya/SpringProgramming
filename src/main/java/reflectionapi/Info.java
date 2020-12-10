package reflectionapi;

public class Info {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c=Class.forName("com.springcore.lifecycle.usingannotations.Test");
        Object object=c.newInstance();
        System.out.println(object);
    }

}
