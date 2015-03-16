package com.example.ivan.healthyway.Model;

/**
 * Created by IVAN on 3/13/2015.
 */
public class Faskes {

    public int id_faskes;
    public String nama_faskes;
    public int kategori;
    public String deskripsi;
    public String lokasi;
    public double latitude;
    public double logitude;
    public int ratingall;

    public Faskes(int id_faskes, String nama_faskes, int kategori, String deskripsi, String lokasi, double latitude, double logitude, int ratingall) {
        this.id_faskes = id_faskes;
        this.nama_faskes = nama_faskes;
        this.kategori = kategori;
        this.deskripsi = deskripsi;
        this.lokasi = lokasi;
        this.latitude = latitude;
        this.logitude = logitude;
        this.ratingall = ratingall;
    }
}
