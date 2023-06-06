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
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class Data implements Initializable {

    @FXML
    private TextField isiHarga;

    @FXML
    private TextField isiJenis;

    @FXML
    private TextField isiNama;

    @FXML
    private TextField isiTahun;

    @FXML
    private TextField isiTransmisi;


    @FXML
    private Button btnDash;

    @FXML
    private Button btnData;

    @FXML
    private Button btnLogout;

    @FXML
    private Button btnMember;

    @FXML
    private TableView<Mobil> table;
    @FXML
    private TableColumn<Mobil, String> nama;
    @FXML
    private TableColumn<Mobil, String> transmisi;
    @FXML
    private TableColumn<Mobil, String> jenis;
    @FXML
    private TableColumn<Mobil, String> tahun;
    @FXML
    private TableColumn<Mobil, String> harga;

    @FXML
    private Text error;
    @FXML
    private Text user;

    @FXML
    void dash(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("dashboard.fxml");
    }
    @FXML
    void member(ActionEvent event) throws IOException {
        Main main = new Main();
        main.changeScene("member.fxml");
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
        btnData.setStyle("-fx-background-color: #ff0000; -fx-text-fill: white");
        btnMember.setStyle("-fx-text-fill: black");
        btnDash.setStyle("-fx-text-fill: black");
        btnLogout.setStyle("-fx-text-fill: black");
    }
    ObservableList<Mobil> observableList = FXCollections.observableArrayList(
            new Mobil("Pagani Utopia","Manual M/T","Coupe","2022","900000"),
            new Mobil("Pagani Huayra","Manual M/T","Roadster","2018","150000"),
            new Mobil("Nissan March","Matic A/T","Hatchback","2018","240000"),
            new Mobil("Porche 993","Manual M/T","Coupe","1998","500000"),
            new Mobil("Palisade","Matic A/T","Luxury MPV","2023","800000"),
            new Mobil("Honda Jazz","Matic A/T","Hatchback","2018","100000")
    );
    @FXML
    void tambah(ActionEvent event) {
        if(isiNama.getText().isEmpty() || isiTransmisi.getText().isEmpty() || isiJenis.getText().isEmpty() || isiTahun.getText().isEmpty() || isiHarga.getText().isEmpty()){
            error.setText("Data Tidak Boleh Kosong");
        }else {
            Mobil mobil = new Mobil(isiNama.getText(), isiTransmisi.getText(), isiJenis.getText(), isiTahun.getText(), isiHarga.getText());
            table.getItems().add(mobil);
            error.setText("Mobil Berhasil Ditambahkan");
            isiNama.setText("");
            isiTransmisi.setText("");
            isiJenis.setText("");
            isiTahun.setText("");
            isiHarga.setText("");
        }
    }
    @FXML
    void hapus(ActionEvent event) {
        int selekid = table.getSelectionModel().getSelectedIndex();
        table.getItems().remove(selekid);
        error.setText("Data berhasil dihapus");
        isiNama.setText("");
        isiTransmisi.setText("");
        isiJenis.setText("");
        isiTahun.setText("");
        isiHarga.setText("");

    }

    @FXML
    void klikkolom(MouseEvent event) {
        Mobil klikk = table.getSelectionModel().getSelectedItem();
        isiNama.setText(String.valueOf(klikk.getNama()));
        isiTransmisi.setText(String.valueOf(klikk.getTransmisi()));
        isiJenis.setText(String.valueOf(klikk.getJenis()));
        isiTahun.setText(klikk.getTahun());
        isiHarga.setText(klikk.getHarga());

    }
}
