package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MembershipUser {

    @FXML
    private Button DashboardUser;

    @FXML
    private Button Logout;

    @FXML
    private Button MemberUser;

    @FXML
    private Button StatusUser;



    @FXML
    void tapMember(ActionEvent event) {

    }


    public void tapDashboard(ActionEvent event)throws IOException{
        balikdash();
    }
    private void balikdash()throws IOException{
        Main f = new Main();
        f.changeScene("DashboardUser.fxml");
    }
    public void tapStatus(ActionEvent event)throws IOException{
        cekstatus();
    }
    private void cekstatus()throws IOException{
        Main g = new Main();
        g.changeScene("StatusUser.fxml");
    }
    public void userLogout(ActionEvent event)throws IOException{
        keluar();
    }
    private void keluar()throws IOException{
        Main h = new Main();
        h.changeScene("Login.fxml");
    }

}
