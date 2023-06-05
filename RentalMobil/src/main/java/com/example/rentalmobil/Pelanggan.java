package com.example.rentalmobil;

import javafx.beans.property.SimpleStringProperty;

public class Pelanggan {
    private SimpleStringProperty nama;
    private SimpleStringProperty gender;
    private SimpleStringProperty alamat;
    private SimpleStringProperty jenis;

    public Pelanggan(String nama, String gender, String alamat, String jenis) {
        this.nama = new SimpleStringProperty(nama);
        this.gender = new SimpleStringProperty(gender);
        this.alamat = new SimpleStringProperty(alamat);
        this.jenis = new SimpleStringProperty(jenis);
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama = new SimpleStringProperty(nama);
    }

    public String getGender() {
        return gender.get();
    }

    public void setGender(String gender) {
        this.gender = new SimpleStringProperty(gender);
    }

    public String getAlamat() {
        return alamat.get();
    }

    public void setAlamat(String alamat) {
        this.alamat = new SimpleStringProperty(alamat);
    }

    public String getJenis() {
        return jenis.get();
    }

    public void setJenis(String jenis) {
        this.jenis = new SimpleStringProperty(jenis);
    }
}
