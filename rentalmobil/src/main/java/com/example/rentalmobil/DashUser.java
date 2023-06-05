package com.example.rentalmobil;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashUser implements Initializable {

    @FXML
    private Button btnDash;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnMember;

    @FXML
    private Button btnStatus;

    @FXML
    private TableColumn<Mobil, String> harga;

    @FXML
    private TableColumn<Mobil, String> jenis;

    @FXML
    private TableColumn<Mobil, String> nama;

    @FXML
    private TableView<Mobil> table;

    @FXML
    private TableColumn<Mobil, String> tahun;

    @FXML
    private TableColumn<Mobil, String> transmisi;

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
        String host = "";
        nama.setCellValueFactory(new PropertyValueFactory<>("Nama"));
        transmisi.setCellValueFactory(new PropertyValueFactory<>("Transmisi"));
        jenis.setCellValueFactory(new PropertyValueFactory<>("Jenis"));
        tahun.setCellValueFactory(new PropertyValueFactory<>("Tahun"));
        harga.setCellValueFactory(new PropertyValueFactory<>("Harga"));
        table.setItems(observableList);

        try {
            BufferedReader brRead = new BufferedReader(new FileReader("hostname.txt"));
            host = brRead.readLine();
        }catch (IOException e){
            System.out.println("File Tidak Ada");
        }
        user.setText(host.toUpperCase());
        btnDash.setStyle("-fx-background-color: #ff0000; -fx-text-fill: white");
        btnMember.setStyle("-fx-text-fill: black");
        btnStatus.setStyle("-fx-text-fill: black");
        btnLogout.setStyle("-fx-text-fill: black");
    }
    ObservableList<Mobil> observableList = FXCollections.observableArrayList(
            new Mobil("Pagani Utopia","Manual M/T","Coupe","2022","200000"),
            new Mobil("Pagani Huayra","Manual M/T","Roadster","2018","150000"),
            new Mobil("Nissan March","Matic A/T","Hatchback","2018","30000"),
            new Mobil("Porche 993","Manual","Coupe","1998","500000"),
            new Mobil("Palisade","A/T","Luxury MPV","2023","10000"),
            new Mobil("Honda Jazz","A/T","Hatchback","2018","50000")
    );
}
