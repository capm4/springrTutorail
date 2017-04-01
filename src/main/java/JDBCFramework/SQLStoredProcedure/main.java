package JDBCFramework.SQLStoredProcedure;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Alex on 01.04.2017.
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app-SQLStoredProcedure.xml");
        StudentJDBCTemp studentJDBCTemp = (StudentJDBCTemp) context.getBean("jdbcTemp");
        System.out.println("------Records Creation--------" );
        studentJDBCTemp.createInBD("Zara", 11);
        studentJDBCTemp.createInBD("Nuha", 2);
        studentJDBCTemp.createInBD("Ayan", 15);
        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemp.listStudent();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Listing Record with ID = 40 -----" );
        Student student = studentJDBCTemp.getStudent(40);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());

    }
}

