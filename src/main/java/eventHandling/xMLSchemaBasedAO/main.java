package eventHandling.xMLSchemaBasedAO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Alex on 30.03.2017.
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-XMLSchemaBasedAO.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();

        student.printThrowException();
    }
}
