package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.ResourceBundle;

public class Login implements Initializable {
    @FXML
    private Button btnLogin;

    @FXML
    private Button btnRegis;
    @FXML
    private Label error;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField passwordKonfir;

    @FXML
    private Label rePassword;

    @FXML
    private TextField username;

    @FXML
    void login(ActionEvent event) throws IOException {
        String line = "";
        String user = "";
        String pass = "";
        String[] simpan = null;
        String[] pisah1 = null;
        String[] pisah2 = null;
        rePassword.setVisible(false);
        passwordKonfir.setVisible(false);
        btnLogin.setStyle("-fx-background-color: #3d75e4; -fx-text-fill: white");
        btnRegis.setStyle("-fx-text-fill: black");
        if(Objects.equals(username.getText(), "") || Objects.equals(password.getText(), "")){
            error.setText("Username / Password Kosong!");
        }else {
            BufferedReader bfRead = new BufferedReader(new FileReader("user.txt"));
            while ((line = bfRead.readLine())!=null){
                simpan = line.split("//");
                pisah1 = simpan[0].split("Username: ");
                user = pisah1[1];
                simpan = line.split("//");
                pisah2 = simpan[1].split("Password: ");
                pass = pisah2[1];
                if(Objects.equals(user, username.getText()) && Objects.equals(pass, password.getText()) && Objects.equals(user, "admin") && Objects.equals(pass, "admin")){
                    BufferedWriter bfWrite = new BufferedWriter(new FileWriter("hostname.txt"));
                    bfWrite.write(user);
                    bfWrite.close();
                    Main main = new Main();
                    main.changeScene("dashboard.fxml");
                }else if(Objects.equals(user, username.getText()) && Objects.equals(pass, password.getText())){
                    BufferedWriter bfWrite = new BufferedWriter(new FileWriter("hostname.txt"));
                    bfWrite.write(user);
                    bfWrite.close();
                    Main main = new Main();
                    main.changeScene("dashUser.fxml");
                }else if(!Objects.equals(user, username.getText())){
                    error.setText("User Tidak Terdaftar");
                }
            }
        }
    }

    @FXML
    void signup(ActionEvent event) throws IOException {
        String line = "";
        ArrayList<String> simpan = new ArrayList<>();
        rePassword.setVisible(true);
        passwordKonfir.setVisible(true);
        btnRegis.setStyle("-fx-background-color: #3d75e4; -fx-text-fill: white");
        btnLogin.setStyle("-fx-text-fill: black");
        if(Objects.equals(username.getText(), "") || Objects.equals(password.getText(), "") || Objects.equals(passwordKonfir.getText(), "")){
            error.setText("Silahkan Isi Data");
        }else if(Objects.equals(password.getText(), passwordKonfir.getText())){
            BufferedReader bfRead = new BufferedReader(new FileReader("user.txt"));
            while ((line = bfRead.readLine())!=null){
                simpan.add(line);
            }
            BufferedWriter bfWrite = new BufferedWriter(new FileWriter("user.txt"));
            for (String s : simpan) {
                bfWrite.write(s);
                bfWrite.newLine();
            }
            bfWrite.write("Username: "+username.getText()+"//Password: "+password.getText());
            bfWrite.close();
            error.setText("Registrasi Berhasil");
        }else{
            error.setText("Password Tidak Sama");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        rePassword.setVisible(false);
        passwordKonfir.setVisible(false);
        File file = new File("user.txt");
        if(!file.exists()){
            SimpanUser simpan = new SimpanUser();
            try {
                simpan.buatData();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
