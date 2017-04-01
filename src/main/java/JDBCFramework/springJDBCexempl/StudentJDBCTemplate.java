package JDBCFramework.springJDBCexempl;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Alex on 31.03.2017.
 */
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void createInBD(String name, Integer age) {
        String createSQL = "insert into Student(name, age) values (?, ?)";
        jdbcTemplateObject.update(createSQL, name, age);
        System.out.println("Create record name = "+name+", age = "+ age);
        return;
    }

    public Student getStudent(Integer id) {
        String getStudentSQL = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(getStudentSQL,
                new Object[]{id}, new StudentMapper());
        return student;
    }

    public List<Student> listStudent() {
        String listStudentSQL = "select * from student";
        List<Student> students = jdbcTemplateObject.query(listStudentSQL, new StudentMapper());
        return students;
    }

    public void deleteStudent(Integer id) {
        String deleteSQL = "delete from student where id = ?";
        jdbcTemplateObject.update(deleteSQL, id);
        System.out.println("Delete record with id = "+ id);
        return;
    }

    public void update(Integer id, Integer age) {
        String updateSQL = "update student set age = ? where id = ?";
        jdbcTemplateObject.update(updateSQL, age, id);
        return;
    }
}
