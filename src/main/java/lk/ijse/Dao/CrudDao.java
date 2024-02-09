package lk.ijse.Dao;

import java.sql.SQLException;

public interface CrudDao<T> extends SuperDao{

    boolean add(T t) throws SQLException, ClassNotFoundException;

}
