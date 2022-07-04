package com.le30r.practice.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class CourierDeliveryPK implements Serializable {
    @Column(name = "Courier")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courier;
    @Column(name = "Delivery")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer delivery;

    public Integer getCourier() {
        return courier;
    }

    public void setCourier(Integer courier) {
        this.courier = courier;
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
        CourierDeliveryPK that = (CourierDeliveryPK) o;
        return Objects.equals(courier, that.courier) && Objects.equals(delivery, that.delivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courier, delivery);
    }
}
