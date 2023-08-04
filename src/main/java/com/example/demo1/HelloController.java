package com.example.demo1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {
    public TextField UserNameTextField;
    public Button CancelButtom;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    public void onCancelButtonClick(ActionEvent e) {
        Stage stage= (Stage) CancelButtom.getScene().getWindow();
        stage.close();
    }
}