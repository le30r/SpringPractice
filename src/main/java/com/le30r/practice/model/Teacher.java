package com.le30r.practice.model;

import java.util.Date;

public class Teacher extends Person {
    Title title;
    String department;


    public Teacher(String name, Date dateOfBirth, int id, String email, String phone, String address) {
        super(name, dateOfBirth, id, email, phone, address);
    }

    public Teacher(String name, Date dateOfBirth, int id, String email, String phone, String address,
                   Title title, String department) {
        super(name, dateOfBirth, id, email, phone, address);
        this.title = title;
        this.department = department;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
