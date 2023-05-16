package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class DataMobilAdmin {

    @FXML
    private Button Logout;
    @FXML
    private Button Dash;
    @FXML
    private Button adminInsert;
    @FXML
    private Button MemberAdmin;
    @FXML
    private Button EditAdmin;

    public void userLogout(ActionEvent event)throws IOException {
        checkLogout();
    }
    private void checkLogout()throws IOException{
        Main p = new Main();
        p.changeScene("Login.fxml");
    }
    public void tapDash(ActionEvent event)throws IOException{
        klikDash();
    }
    private void klikDash()throws IOException{
        Main o = new Main();
        o.changeScene("DashboardAdmin.fxml");
    }

    public void nambahMobil(ActionEvent event)throws IOException{
        insertData();
    }
    private void insertData()throws IOException{
        Main i = new Main();
        i.changeScene("InsertDataMobilAdmin.fxml");
    }

    public void tapMember(ActionEvent event)throws IOException{
        liatMember();
    }
    private void liatMember()throws IOException{
        Main u = new Main();
        u.changeScene("MembershipAdmin.fxml");
    }
    public void ubahInfo(ActionEvent event)throws IOException {
        editData();
    }
    private void editData()throws IOException{
        Main f = new Main();
        f.changeScene("TambahEditInformasiMobilAdmin.fxml");
    }
}
