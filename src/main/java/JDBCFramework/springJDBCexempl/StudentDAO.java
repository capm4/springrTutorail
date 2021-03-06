package JDBCFramework.springJDBCexempl;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by Alex on 31.03.2017.
 */
public interface StudentDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource dataSource);

    /**
     * This is the method to be used to create
     * a record in the Student table.
     */
    public void createInBD(String name, Integer age);

    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed student id.
     */
    public Student getStudent(Integer id);

    /**
     * This is the method to be used to list down
     * all the records from the Student table.
     */
    public List<Student> listStudent();

    /**
     * This is the method to be used to delete
     * a record from the Student table corresponding
     * to a passed student id.
     */

    public void deleteStudent(Integer id);

    /**
     * This is the method to be used to update
     * a record into the Student table.
     * */

    public void update (Integer id, Integer age);
}
