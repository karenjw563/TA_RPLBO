package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MemberUser implements Initializable {

    @FXML
    private Button btnDash;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnMember;

    @FXML
    private Button btnStatus;

    @FXML
    private Text error;

    @FXML
    private Text user;

    @FXML
    void dash(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("dashUser.fxml");
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("login.fxml");
    }

    @FXML
    void member(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("memberUser.fxml");
    }

    @FXML
    void status(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("status.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnMember.setStyle("-fx-background-color: #ff0000; -fx-text-fill: white");
        btnDash.setStyle("-fx-text-fill: black");
        btnStatus.setStyle("-fx-text-fill: black");
        btnLogout.setStyle("-fx-text-fill: black");
        String host = "";
        try {
            BufferedReader brRead = new BufferedReader(new FileReader("hostname.txt"));
            host = brRead.readLine();
        }catch (IOException e){
            System.out.println("File Tidak Ada");
        }
        user.setText(host.toUpperCase());
    }
}
