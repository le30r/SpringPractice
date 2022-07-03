package com.le30r.practice.model;

import java.util.Date;

public class Student extends Person {
    int group;
    Date admission;
    String faculty;
    String specialty;

    public Student(String name, Date dateOfBirth, int id, String email, String phone, String address) {
        super(name, dateOfBirth, id, email, phone, address);
    }

    public Student(String name, Date dateOfBirth, int id, String email, String phone, String address,
                   int group, Date admission, String faculty, String specialty) {
        super(name, dateOfBirth, id, email, phone, address);
        this.group = group;
        this.admission = admission;
        this.faculty = faculty;
        this.specialty = specialty;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public Date getAdmission() {
        return admission;
    }

    public void setAdmission(Date admission) {
        this.admission = admission;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
