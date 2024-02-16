package lk.ijse.Dao;

import lk.ijse.Dao.impl.StudentDaoImpl;

public class DaoFactory {
    private static DaoFactory daoFactory;

    private DaoFactory(){}

    public static DaoFactory getDaoFactory(){
        return daoFactory == null ? daoFactory = new DaoFactory() : daoFactory;
    }

    public enum DaoTyps{
        STUDENT
    }

    public SuperDao getDAO(DaoTyps daoTypes){
        switch (daoTypes) {
            case STUDENT:
                return (SuperDao) new StudentDaoImpl();
            default:
                return null;
        }
    }
}
