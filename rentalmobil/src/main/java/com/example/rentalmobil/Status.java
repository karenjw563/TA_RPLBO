package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Status implements Initializable {

    @FXML
    private TextField alamat;
    @FXML
    private Label error;
    @FXML
    private Button btnDash;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnMember;

    @FXML
    private Button btnStatus;

    @FXML
    private TextField catatan;

    @FXML
    private TextField jam;

    @FXML
    private TextField nama;

    @FXML
    private TextField noHp;

    @FXML
    private TextField tanggal;

    @FXML
    private Text user;

    @FXML
    void dash(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("dashUser.fxml");
    }
    @FXML
    void member(ActionEvent event) throws IOException{
        Main main = new Main();
        main.changeScene("memberUser.fxml");
    }
    @FXML
    void status(ActionEvent event) throws IOException{
        Main main = new Main();
        main.changeScene("status.fxml");
    }
    @FXML
    void logout(ActionEvent event) throws IOException{
        Main main = new Main();
        main.changeScene("login.fxml");
    }
    @FXML
    void hapus(ActionEvent event) {
        nama.setText("");
        noHp.setText("");
        alamat.setText("");
        jam.setText("");
        tanggal.setText("");
        catatan.setText("");
    }

    @FXML
    void kirim(ActionEvent event) {
        if(nama.getText().isEmpty() || noHp.getText().isEmpty() || alamat.getText().isEmpty() || jam.getText().isEmpty()||
        tanggal.getText().isEmpty() || catatan.getText().isEmpty()){
            error.setText("Data Tidak Boleh Kosong");
        }else{
            try {
                BufferedWriter bfWriter = new BufferedWriter(new FileWriter("statusData.txt"));
                bfWriter.write("Nama: " + nama.getText());
                bfWriter.newLine();
                bfWriter.write("No. HP: " + noHp.getText());
                bfWriter.newLine();
                bfWriter.write("Alamat: " + alamat.getText());
                bfWriter.newLine();
                bfWriter.write("Jam: " + jam.getText());
                bfWriter.newLine();
                bfWriter.write("Tanggal: " + tanggal.getText());
                bfWriter.newLine();
                bfWriter.write("Catatan: " + catatan.getText());
                bfWriter.newLine();
                bfWriter.close();
                error.setText("Data Berhasil Dikirim");
                nama.setText("");
                noHp.setText("");
                alamat.setText("");
                jam.setText("");
                tanggal.setText("");
                catatan.setText("");
            }catch (IOException e){
                System.out.println("File Error");
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
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
