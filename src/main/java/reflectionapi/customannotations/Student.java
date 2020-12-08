package reflectionapi.customannotations;
@Course(id="220",name="Ramesh",cost=60000)
public class Student {
    String id;
    String name;
    int cost;

    public Student(String id, String name, int cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }
    public void detail(){
        System.out.println("id is "+id);
        System.out.println("name is "+name);
        System.out.println("cost is "+cost);
    }
}
