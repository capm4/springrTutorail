package JDBCFramework.SQLStoredProcedure;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Alex on 01.04.2017.
 */
public class StudentMapper implements RowMapper {
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setAge(rs.getInt("age"));
        student.setName(rs.getString("name"));
        return student;
    }
}
