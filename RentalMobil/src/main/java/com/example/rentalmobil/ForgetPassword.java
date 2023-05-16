package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ForgetPassword {

    @FXML
    private Button submitID;
    @FXML
    private TextArea txtID;
    @FXML
    private TextField mailID;

    public void userSubmit(ActionEvent event) throws IOException {
        checkSubmit();
    }
    private void checkSubmit() throws IOException{
        Main s = new Main();
        s.changeScene("Login.fxml");
    }

}
