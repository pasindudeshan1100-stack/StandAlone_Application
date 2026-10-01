package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class LoginPageController {

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnSubmit;

    @FXML
    void Btn2OnAction(ActionEvent event) {
    System.out.println("btn1");
    }

    @FXML
    void Btn3OnAction(ActionEvent event) {
        System.out.println("btn2");
    }

    @FXML
    void btnSubmitOnAction(ActionEvent event) {
        System.out.println("btn3");
    }

}

