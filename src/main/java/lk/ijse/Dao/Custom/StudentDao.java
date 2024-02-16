package lk.ijse.Dao.Custom;

import lk.ijse.Dao.CrudDao;
import lk.ijse.Dto.StudentDto;

import java.sql.SQLException;

public interface StudentDao extends CrudDao<StudentDao> {

    boolean add(StudentDto dto) throws SQLException, ClassNotFoundException;

}
