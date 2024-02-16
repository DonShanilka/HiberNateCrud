package lk.ijse.Bo.impl;

import lk.ijse.Bo.custom.StudentBo;
import lk.ijse.Dao.Custom.StudentDao;
import lk.ijse.Dao.DaoFactory;
import lk.ijse.Dto.StudentDto;
import lk.ijse.Entity.Student;

import java.sql.SQLException;

public class SudentBoimpl implements StudentBo {
    StudentDao studentDao = (StudentDao) DaoFactory.getDaoFactory().getDAO(DaoFactory.DaoTyps.STUDENT);

    @Override
    public boolean add(StudentDto dto) throws SQLException, ClassNotFoundException {
            return studentDao.add((StudentDao) new Student(dto.getId(),dto.getName()));

    }
}
