package com.example.rentalmobil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Member implements Initializable {

    @FXML
    private TableView<Pelanggan> table;
    @FXML
    private TableColumn<Pelanggan, String> nama;
    @FXML
    private TableColumn<Pelanggan, String> gender;
    @FXML
    private TableColumn<Pelanggan, String> alamat;
    @FXML
    private TableColumn<Pelanggan, String> jenis;
    @FXML
    private TextField isiAlamat;

    @FXML
    private TextField isiGender;

    @FXML
    private TextField isiJenis;

    @FXML
    private TextField isiNama;
    @FXML
    private Text error;

    @FXML
    private Button btnDash;

    @FXML
    private Button btnData;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnMember;

    @FXML
    private Text user;

    @FXML
    void dash(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("dashboard.fxml");
    }

    @FXML
    void data(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("data.fxml");
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("login.fxml");
    }

    @FXML
    void member(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("member.fxml");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String host = "";
        nama.setCellValueFactory(new PropertyValueFactory<>("Nama"));
        gender.setCellValueFactory(new PropertyValueFactory<>("Gender"));
        alamat.setCellValueFactory(new PropertyValueFactory<>("Alamat"));
        jenis.setCellValueFactory(new PropertyValueFactory<>("Jenis"));
        table.setItems(observableList);

        try {
            BufferedReader brRead = new BufferedReader(new FileReader("hostname.txt"));
            host = brRead.readLine();
        }catch (IOException e){
            System.out.println("File Tidak Ada");
        }
        user.setText(host.toUpperCase());
        btnMember.setStyle("-fx-background-color: #ff0000; -fx-text-fill: white");
        btnDash.setStyle("-fx-text-fill: black");
        btnData.setStyle("-fx-text-fill: black");
        btnLogout.setStyle("-fx-text-fill: black");
    }
    ObservableList<Pelanggan> observableList = FXCollections.observableArrayList(
            new Pelanggan("Uzumaki Naruto","Laki - laki","Jl. Cinta dan Harapan","Diamond Member"),
            new Pelanggan("Tukul Arwana","Laki - laki","Jl. Kembali ke Laptop","Silver Member"),
            new Pelanggan("Megawati","Perempuan","Jl. Dibalik Layar","Gold Member")
    );
    @FXML
    void tambah(ActionEvent event) {
        if(isiNama.getText().isEmpty() || isiGender.getText().isEmpty() || isiAlamat.getText().isEmpty() || isiJenis.getText().isEmpty()){
            error.setText("Data Tidak Boleh Kosong");
        }else {
            Pelanggan pelanggan = new Pelanggan(isiNama.getText(), isiGender.getText(), isiAlamat.getText(), isiJenis.getText());
            table.getItems().add(pelanggan);
            error.setText("Member Berhasil Ditambahkan");
            isiNama.setText("");
            isiGender.setText("");
            isiAlamat.setText("");
            isiJenis.setText("");
        }
    }
    @FXML
    void hapus(ActionEvent event) {
        error.setText("");
        isiNama.setText("");
        isiGender.setText("");
        isiAlamat.setText("");
        isiJenis.setText("");
    }
}
