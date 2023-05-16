package com.example.rentalmobil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class InsertDataMobilAdmin {

    @FXML
    private Button Dashboard;

    @FXML
    private Button Logout;

    @FXML
    private Button MemberAdmin;

    @FXML
    private Button SubmitData;

    @FXML
    private Button dataMobil;


    public void tapDash(ActionEvent event)throws IOException{
        pindahDash();
    }
    public void pindahDash()throws IOException{
        Main p = new Main();
        p.changeScene("DashboardAdmin.fxml");
    }

    public void tapMember(ActionEvent event)throws IOException{
        pindahMember();
    }
    public void pindahMember()throws IOException{
        Main o = new Main();
        o.changeScene("MembershipAdmin.fxml");
    }
    public void mobilCUD(ActionEvent event)throws IOException{
        mobill();
    }
    public void mobill()throws IOException{
        Main i = new Main();
        i.changeScene("DataMobilAdmin.fxml");
    }
    public void userLogout(ActionEvent event)throws IOException{
        keluar();

    }
    public void keluar()throws IOException{
        Main u = new Main();
        u.changeScene("Login.fxml");
    }
    public void insertData(ActionEvent event)throws IOException{
        tambahmobil();
    }
    public void tambahmobil()throws IOException{
        Main y = new Main();
        y.changeScene("DataMobilAdmin.fxml");
    }

}
