package com.example.ivan.healthyway.Model;

/**
 * Created by IVAN on 3/13/2015.
 */
public class User {

    public int id_user;
    public String password;
    public String email;
    public String nama;

    public User(int id_user, String password, String email, String nama) {
        this.id_user = id_user;
        this.password = password;
        this.email = email;
        this.nama = nama;
    }
}
