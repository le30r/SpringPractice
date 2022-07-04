package com.le30r.practice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Users", schema = "dbo", catalog = "DeliveryService")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "UserLogin")
    private String userLogin;
    @Basic
    @Column(name = "PasswordHash")
    private String passwordHash;
    @Basic
    @Column(name = "AccessLevel")
    private Integer accessLevel;
    @OneToOne(mappedBy = "usersByClientId")
    private Client clientById;
    @OneToOne(mappedBy = "usersByCourierId")
    private Courier courierById;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(userLogin, user.userLogin) && Objects.equals(passwordHash, user.passwordHash) && Objects.equals(accessLevel, user.accessLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userLogin, passwordHash, accessLevel);
    }

    public Client getClientById() {
        return clientById;
    }

    public void setClientById(Client clientById) {
        this.clientById = clientById;
    }

    public Courier getCourierById() {
        return courierById;
    }

    public void setCourierById(Courier courierById) {
        this.courierById = courierById;
    }
}
