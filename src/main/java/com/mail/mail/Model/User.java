package com.mail.mail.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "Current_Balance")
    private int Current_Balance;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Email")
    private String EMail;

    @Column(name = "Phone_Number")
    private String Phone_Number;;

    public User(int id, String name, int Current_Balance, String Password, String EMail, String Phone_Number) {
        this.id = id;
        this.name = name;
        this.Current_Balance = Current_Balance;
        this.Password = Password;
        this.EMail = EMail;
        this.Phone_Number = Phone_Number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrent_Balance() {
        return Current_Balance;
    }

    public void setCurrent_Balance(int current_Balance) {
        Current_Balance = current_Balance;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEMail() {
        return EMail;
    }

    public void setEMail(String EMail) {
        this.EMail = EMail;
    }

    public String getPhone_Number() {
        return Phone_Number;
    }

    public void setPhone_Number(String phone_Number) {
        Phone_Number = phone_Number;
    }

    public User() {
    }
}
