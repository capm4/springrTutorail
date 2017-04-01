package JDBCFramework.springJDBCexempl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Alex on 31.03.2017.
 */
public class main {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("app-spring-jdbc-exampl.xml");
        StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("jdbcTemplate");

        System.out.println("------Records Creation--------" );
        studentJDBCTemplate.createInBD("Zara", 11);
        studentJDBCTemplate.createInBD("Nuha", 2);
        studentJDBCTemplate.createInBD("Ayan", 15);
        System.out.println("------Listing Multiple Records--------" );
        List<Student> students = studentJDBCTemplate.listStudent();
        for (Student record : students) {
            System.out.print("ID : " + record.getId() );
            System.out.print(", Name : " + record.getName() );
            System.out.println(", Age : " + record.getAge());
        }
        System.out.println("----Updating Record with ID = 2 -----" );
        studentJDBCTemplate.update(33, 20);
        System.out.println("----Listing Record with ID = 2 -----" );
        Student student = studentJDBCTemplate.getStudent(33);
        System.out.print("ID : " + student.getId() );
        System.out.print(", Name : " + student.getName() );
        System.out.println(", Age : " + student.getAge());
    }
}
