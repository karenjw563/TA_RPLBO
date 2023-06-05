package com.example.rentalmobil;

import java.io.*;
import java.util.ArrayList;

public class SimpanUser {
    private String username;
    private String password;

    public void buatData() throws IOException {
        BufferedWriter bfWrite = new BufferedWriter(new FileWriter("user.txt"));
        bfWrite.write("Username: admin//Password: admin");
        bfWrite.newLine();
        bfWrite.write("Username: user//Password: user");
        bfWrite.close();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
