package anotation.autowriteFalseR;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    @Autowired(required = false)
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }
}
