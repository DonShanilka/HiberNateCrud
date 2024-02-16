package lk.ijse.Bo;

import lk.ijse.Bo.custom.StudentBo;
import lk.ijse.Bo.impl.SudentBoimpl;
import lk.ijse.Dao.impl.StudentDaoImpl;

public class BoFactory {

        private static BoFactory boFactory;

        private BoFactory(){}

        public static BoFactory getBoFactory(){
            return boFactory == null ? boFactory = new BoFactory() : boFactory;
        }

        public enum BoTyps{
            STUDENT
        }

        public SuperBo getBo(BoTyps boTyps){
            switch (boTyps) {
                case STUDENT:
                    return new SudentBoimpl();

                default:
                    return null;
            }
        }

}
