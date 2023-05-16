package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import java.io.IOException;


public class SignUp {

    @FXML
    private Button btnSign;
    @FXML
    private TextField namaDPN;
    @FXML
    private TextField namaBLKG;
    @FXML
    private TextField mail;
    @FXML
    private TextField pass;
    @FXML
    private Label warning;

    public void userDaftar(ActionEvent event) throws IOException{
        checkDaftar();
    }

    private void checkDaftar() throws IOException{
        Main y = new Main();
        if (namaDPN.getText().isEmpty() || namaBLKG.getText().isEmpty() || mail.getText().isEmpty() || pass.getText().isEmpty()) {
            warning.setText("Isi data diatas dengan lengkap!");
        } else {
            y.changeScene("Login.fxml");
        }
    }

}
