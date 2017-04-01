package eventHandling.xMLSchemaBasedAO;

/**
 * Created by Alex on 30.03.2017.
 */
public class Student {
    Integer age;
    String name;

    public Integer getAge() {
        System.out.println("Age " + age);
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        System.out.println("Name : " + name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void printThrowException(){
        System.out.println("Exception raised");
        throw new IllegalArgumentException();
    }
}
