package com.example.rentalmobil;

import javafx.beans.property.SimpleStringProperty;

public class Mobil {
    private SimpleStringProperty nama;
    private SimpleStringProperty transmisi;
    private SimpleStringProperty jenis;
    private SimpleStringProperty tahun;
    private SimpleStringProperty harga;

    public Mobil(String nama, String transmisi, String jenis, String tahun, String harga) {
        this.nama = new SimpleStringProperty(nama);
        this.transmisi = new SimpleStringProperty(transmisi);
        this.jenis = new SimpleStringProperty(jenis);
        this.tahun = new SimpleStringProperty(tahun);
        this.harga = new SimpleStringProperty(harga);
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama = new SimpleStringProperty(nama);
    }

    public String getTransmisi() {
        return transmisi.get();
    }

    public void setTransmisi(String transmisi) {
        this.transmisi = new SimpleStringProperty(transmisi);
    }

    public String getJenis() {
        return jenis.get();
    }

    public void setJenis(String jenis) {
        this.jenis = new SimpleStringProperty(jenis);
    }

    public String getTahun() {
        return tahun.get();
    }

    public void setTahun(String tahun) {
        this.tahun = new SimpleStringProperty(tahun);
    }

    public String getHarga() {
        return harga.get();
    }

    public void setHarga(String harga) {
        this.harga = new SimpleStringProperty(harga);
    }
}
