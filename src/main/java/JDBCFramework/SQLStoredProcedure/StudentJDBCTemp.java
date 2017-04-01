package JDBCFramework.SQLStoredProcedure;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by Alex on 01.04.2017.
 */
public class StudentJDBCTemp implements StudentDAO {
    private DataSource dataSource;
    private SimpleJdbcCall simpleJdbcCall;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.simpleJdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }

    public void createInBD(String name, Integer age) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String SQLcreate = "insert into student (name, age) values (?,?)";
        jdbcTemplate.update(SQLcreate, name, age);
        System.out.println("Create new student name = "+ name+", age = "+ age);
        return;
    }

    public Student getStudent(Integer id) {
        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id", id);
        Map<String, Object> out = simpleJdbcCall.execute(in);
        Student student = new Student();
        student.setId(id);
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));
        return student;

    }

    public List<Student> listStudent() {
        String SQLlist = "select * from student";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        List<Student> students = jdbcTemplate.query(SQLlist, new StudentMapper());
        return students;
    }

    public void deleteStudent(Integer id) {
        String SQLdelete = "delete from student where id = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(SQLdelete, id);
        return;
    }

    public void update(Integer id, Integer age) {
        String SQLupdate = "update student set age = ? where id = ?";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.update(SQLupdate, age, id);
        return;
    }
}
