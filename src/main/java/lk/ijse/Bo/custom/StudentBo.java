package lk.ijse.Bo.custom;

import lk.ijse.Bo.SuperBo;
import lk.ijse.Dto.StudentDto;

import java.sql.SQLException;

public interface StudentBo extends SuperBo {
    boolean add(StudentDto dto) throws SQLException, ClassNotFoundException;

}
