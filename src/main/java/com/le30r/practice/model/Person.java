package com.le30r.practice.model;

import java.util.Date;

public class Person {
    String name;
    Date dateOfBirth;
    int id;
    String email;
    String phone;
    String address;

    public Person(String name, Date dateOfBirth, int id, String email, String phone, String address) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    private Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
