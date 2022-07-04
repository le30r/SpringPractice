package com.le30r.practice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ClientID")
    private Integer clientId;
    @Basic
    @Column(name = "FirstName")
    private String firstName;
    @Basic
    @Column(name = "MiddleName")
    private String middleName;
    @Basic
    @Column(name = "LastName")
    private String lastName;
    @Basic
    @Column(name = "LastDelivery")
    private String lastDelivery;
    @Basic
    @Column(name = "LastShipment")
    private String lastShipment;
    @Basic
    @Column(name = "Phone")
    private String phone;
    @Basic
    @Column(name = "Email")
    private String email;
    @OneToOne
    @JoinColumn(name = "ClientID", referencedColumnName = "ID", nullable = false)
    private User usersByClientId;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(clientId, client.clientId) && Objects.equals(firstName, client.firstName) && Objects.equals(middleName, client.middleName) && Objects.equals(lastName, client.lastName) && Objects.equals(lastDelivery, client.lastDelivery) && Objects.equals(lastShipment, client.lastShipment) && Objects.equals(phone, client.phone) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId, firstName, middleName, lastName, lastDelivery, lastShipment, phone, email);
    }

    public User getUsersByClientId() {
        return usersByClientId;
    }

    public void setUsersByClientId(User usersByClientId) {
        this.usersByClientId = usersByClientId;
    }
}
