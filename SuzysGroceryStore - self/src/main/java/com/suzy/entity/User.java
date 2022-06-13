package com.suzy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; 
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name="password")
    private String pass;



    public User(){}

    @Override
    public String toString() {
        return "User [email=" + email + ", id=" + id + ", pass=" + pass + ", name=" + name + "]";
    }

    public User(Integer id, String name, String email, String pass) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.pass = pass;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    

}
