package eventHandling.AspectJbasedAOPExample;

/**
 * Created by Alex on 30.03.2017.
 */
public class Student {
    Integer age;
    String name;

    public Integer getAge() {
        System.out.println("Age is " + age);
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("Name is " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printThrowException(){
        System.out.println("Exeption raised");
        throw new IllegalArgumentException();
    }
}
