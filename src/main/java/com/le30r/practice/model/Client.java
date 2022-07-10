package com.le30r.practice.model;

import org.hibernate.annotations.Nationalized;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @Column(name = "ClientID")
    private Integer id;

    @Nationalized
    @Column(name = "FirstName", length = 25)
    private String firstName;

    @Nationalized
    @Column(name = "MiddleName", length = 25)
    private String middleName;

    @Nationalized
    @Column(name = "LastName", length = 25)
    private String lastName;

    @Column(name = "Phone")
    private Long phone;

    @Nationalized
    @Column(name = "Email", length = 50)
    private String email;

    @Nationalized
    @Column(name = "LastDelivery", length = 65)
    private String lastDelivery;

    @Nationalized
    @Column(name = "LastShipment", length = 65)
    private String lastShipment;
    public Client() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastDelivery() {
        return lastDelivery;
    }

    public void setLastDelivery(String lastDelivery) {
        this.lastDelivery = lastDelivery;
    }

    public String getLastShipment() {
        return lastShipment;
    }

    public void setLastShipment(String lastShipment) {
        this.lastShipment = lastShipment;
    }
}
