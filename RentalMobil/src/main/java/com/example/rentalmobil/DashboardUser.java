package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;
import java.net.DatagramSocketImpl;

public class DashboardUser {

    @FXML
    private Button DashboardUser;

    @FXML
    private Button DetailSewa;

    @FXML
    private Button Logout;

    @FXML
    private Button MemberUser;

    @FXML
    private Button StatusUser;

    public void tapDashboard(ActionEvent event)throws IOException{
        pergikedash();
    }
    private void pergikedash()throws IOException{
        Main q = new Main();
        q.changeScene("DasboardUser.fxml");
    }


    public void tapMember(ActionEvent event)throws IOException{
        pindahMember();
    }
    private void pindahMember()throws IOException{
        Main q = new Main();
        q.changeScene("MembershipUser.fxml");
    }
    public void tapStatus(ActionEvent event)throws IOException{
        pindahStatus();
    }
    private void pindahStatus()throws IOException {
        Main w = new Main();
        w.changeScene("StatusUser.fxml");
    }
    public void userLogout(ActionEvent event)throws IOException{
        pindah();
    }
    private void pindah()throws IOException {
        Main e = new Main();
        e.changeScene("Login.fxml");
    }
    public void tapDetail(ActionEvent event)throws IOException{
        detailcar();
    }
    private void detailcar()throws IOException{
        Main d = new Main();
        d.changeScene("DetailMobil.fxml");
    }

}
