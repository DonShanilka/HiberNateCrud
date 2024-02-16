package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.Bo.BoFactory;
import lk.ijse.Bo.custom.StudentBo;
import lk.ijse.Dto.StudentDto;
import lk.ijse.Entity.Student;

import java.sql.SQLException;

public class StudentController {

    @FXML
    private TextField txtId;
    @FXML
    private TextField txtName;

    StudentBo customerBo = (StudentBo) BoFactory.getBoFactory().getBo(BoFactory.BoTyps.STUDENT);

    @FXML
    void studentSaveOnAction(ActionEvent event) throws SQLException, ClassNotFoundException {
        String id = txtId.getText();
        String name = txtName.getText();

        var dto = new StudentDto(id,name);


            boolean isSave= customerBo.add(dto);


    }
}
