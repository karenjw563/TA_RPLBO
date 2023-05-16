package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class DetailMobil {

    @FXML
    private Button DashboardUser;

    @FXML
    private Button Logout;

    @FXML
    private Button MemberUser;

    @FXML
    private Button StatusUser;

    @FXML
    private Button UserPesan;

    public void tapDashboard(ActionEvent event)throws IOException{
        balikAwal();
    }
    private void balikAwal()throws IOException{
        Main m = new Main();
        m.changeScene("DasboardUser.fxml");
    }
    public void tapMember(ActionEvent event)throws IOException{
        balikmember();
    }
    private void balikmember()throws IOException{
        Main n = new Main();
        n.changeScene("MembershipUser.fxml");
    }
    public void tapStatus(ActionEvent event)throws IOException{
        balikStatus();
    }
    private void balikStatus()throws IOException{
        Main b = new Main();
        b.changeScene("StatusUser.fxml");
    }
    public void userLogout(ActionEvent event)throws IOException{
        balik();
    }
    private void balik()throws IOException{
        Main v = new Main();
        v.changeScene("Login.fxml");
    }
    public void mauPesan(ActionEvent event)throws IOException{

    }

}
