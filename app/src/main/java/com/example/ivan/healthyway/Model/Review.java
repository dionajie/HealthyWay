package com.example.ivan.healthyway.Model;

/**
 * Created by IVAN on 3/13/2015.
 */
public class Review {

    public int id_review;
    public int rating;
    public String komentar;
    public String tanggal;

    public Review(int id_review, int rating, String komentar, String tanggal) {
        this.id_review = id_review;
        this.rating = rating;
        this.komentar = komentar;
        this.tanggal = tanggal;
    }
}
