package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class DashboardAdmin {

    @FXML
    private Button Logout;
    @FXML
    private Button Dash;
    @FXML
    private Button dataMobil;
    @FXML
    private Button MemberAdmin;


    public void userLogout(ActionEvent event)throws IOException{
        checkLogout();
    }
    private void checkLogout()throws IOException{
        Main r = new Main();
        r.changeScene("Login.fxml");
    }

    public void mobilCUD(ActionEvent event)throws  IOException{
        masukEdit();
    }
    private void masukEdit()throws IOException{
        Main s = new Main();
        s.changeScene("DataMobilAdmin.fxml");
    }
    public void tapMember(ActionEvent event)throws IOException{
        liatMember();
    }
    private void liatMember()throws IOException {
        Main e = new Main();
        e.changeScene("MembershipAdmin.fxml");
    }

}
