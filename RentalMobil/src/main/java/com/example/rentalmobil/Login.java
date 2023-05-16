package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


import java.io.IOException;

public class Login {

    public Login() {

    }

    @FXML
    private Button btnSignUp;
    @FXML
    private Button btnLogin;
    @FXML
    private Label wrongLogin;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Button ForgetPass;

    public void userLogin(ActionEvent event) throws IOException{
        checkLogin();
    }

    private void checkLogin() throws IOException{
        Main m = new Main();
        if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
            wrongLogin.setText("Berhasil Login");

            m.changeScene("DashboardAdmin.fxml");
        } else if (username.getText().toString().equals("user") && password.getText().toString().equals("user")) {
            wrongLogin.setText("Berhasil Login");
            m.changeScene("DasboardUser.fxml"); //harusnya ke fxml user
        } else {
            wrongLogin.setText("Isi Username dan password!");
        }
    }

    public void userSign(ActionEvent event) throws IOException{
        checkSign();
    }
    private void checkSign() throws IOException{
        Main x = new Main();
        x.changeScene("SignUp.fxml");
    }

    public void userForget(ActionEvent event) throws IOException{
        tapFGpass();
    }
    private void tapFGpass() throws IOException{
        Main h = new Main();
        h.changeScene("ForgotPassword.fxml");
    }
}
