package com.le30r.practice.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CargoDeliveryPK implements Serializable {
    @Column(name = "Cargo")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cargo;
    @Column(name = "Delivery")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer delivery;

    public Integer getCargo() {
        return cargo;
    }

    public void setCargo(Integer cargo) {
        this.cargo = cargo;
    }

    public Integer getDelivery() {
        return delivery;
    }

    public void setDelivery(Integer delivery) {
        this.delivery = delivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoDeliveryPK that = (CargoDeliveryPK) o;
        return Objects.equals(cargo, that.cargo) && Objects.equals(delivery, that.delivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargo, delivery);
    }
}
