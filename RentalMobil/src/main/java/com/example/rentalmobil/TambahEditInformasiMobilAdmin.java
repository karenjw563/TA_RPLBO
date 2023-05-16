package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class TambahEditInformasiMobilAdmin {

    @FXML
    private Button Logout;

    @FXML
    private Button MemberAdmin;

    @FXML
    private Button dataMobil;
    @FXML
    private Button SubmitData;

    @FXML
    void mobilCUD(ActionEvent event) {

    }

    @FXML
    void tapMember(ActionEvent event) {

    }

    @FXML
    void userLogout(ActionEvent event) {

    }

    public void tapDash()throws IOException{
        klikDash();
    }
    private void klikDash()throws IOException{
        Main l = new Main();
        l.changeScene("DashboardAdmin.fxml");
    }
    public void tapMember()throws IOException{
        klikMember();
    }
    private void klikMember()throws IOException{
        Main k = new Main();
        k.changeScene("MembershipAdmin.fxml");
    }
    public void mobilCUD()throws IOException{
        pindah();
    }
    private void pindah()throws IOException{
        Main j = new Main();
        j.changeScene("DataMobilAdmin.fxml");
    }
    public void FinishEdit(ActionEvent event)throws IOException{
        selesaiedit();
    }
    private void selesaiedit()throws IOException{
        Main h = new Main();
        h.changeScene("DataMobilAdmin.fxml");
    }

    public void userLogout()throws IOException{
        keluar();
    }
    private void keluar()throws IOException{
        Main g = new Main();
        g.changeScene("Login.fxml ");
    }
}
