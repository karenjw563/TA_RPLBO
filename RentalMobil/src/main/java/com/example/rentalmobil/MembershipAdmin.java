package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class MembershipAdmin {



    @FXML
    private Button Dash;
    @FXML
    private Button Logout;
    @FXML
    private Button MemberAdmin;
    /*
    @FXML
    private TableColumn<MembershipAdmin, String> alamat;
    @FXML
    private TableColumn<MembershipAdmin, String> gender;
    @FXML
    private TableColumn<MembershipAdmin, String> membership;
    @FXML
    private TableColumn<MembershipAdmin, String> nama;
    @FXML
    private TableView<MembershipAdmin> tabelMembership;

    public MembershipAdmin(String user3, String p, String surakarta, String silver) {
    }
*/
    @FXML
    void tapMember(ActionEvent event) {
    }


    public void tapDash(ActionEvent event)throws IOException{
        balikDash();
    }
    private void balikDash()throws IOException{
        Main e = new Main();
        e.changeScene("DashboardAdmin.fxml");
    }

    public void userLogout(ActionEvent event)throws IOException{
        checkLogout();
    }
    private void checkLogout()throws IOException{
        Main r = new Main();
        r.changeScene("Login.fxml");
    }
/*
    public MembershipAdmin(TableColumn<MembershipAdmin, String> alamat, TableColumn<MembershipAdmin, String> gender, TableColumn<MembershipAdmin, String> membership, TableColumn<MembershipAdmin, String> nama) {
        this.alamat = alamat;
        this.gender = gender;
        this.membership = membership;
        this.nama = nama;
    }
*/
    public void tapData()throws IOException{
        masukbaru();
    }
    public void masukbaru()throws IOException{
        Main x = new Main();
        x.changeScene("DataMobilAdmin.fxml");
    }


}
