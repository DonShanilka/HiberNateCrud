package lk.ijse.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lk.ijse.Dto.StudentDto;

public class StudentController {


    @FXML
    private TextField txtId;

    @FXML
    private TextField txtName;

    @FXML
    void studentSaveOnAction(ActionEvent event) {
        String id = txtId.getText();
        String name = txtName.getText();

        var dto = new StudentDto(id,name);

        try {
            boolean isSave =
        }

    }
}
