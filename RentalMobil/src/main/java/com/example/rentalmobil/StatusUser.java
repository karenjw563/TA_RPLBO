package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class StatusUser {

    @FXML
    private Button DashboardUser;

    @FXML
    private Button Logout;

    @FXML
    private Button MemberUser;

    @FXML
    private Button StatusUser;

    public void tapDashboard(ActionEvent event)throws IOException{
        balikdash();
    }
    private void balikdash()throws IOException{
        Main n = new Main();
        n.changeScene("DashboardUser.fxml");
    }
    public void tapMember(ActionEvent event)throws IOException{
        balikmem();
    }
    private void balikmem()throws IOException{
        Main b = new Main();
        b.changeScene("MembershipUser.fxml");
    }
    public void tapStatus(ActionEvent event)throws IOException{
        balikstat();
    }
    private void balikstat()throws IOException{
        Main v = new Main();
        v.changeScene("StatusUser.fxml");
    }
    public void userLogout(ActionEvent event)throws IOException{
        keluarja();
    }
    private void keluarja()throws IOException{
        Main v = new Main();
        v.changeScene("Login.fxml");
    }

}
