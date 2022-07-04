package com.le30r.practice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@IdClass(CargoDeliveryPK.class)
public class CargoDelivery {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Cargo")
    private Integer cargo;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Delivery")
    private Integer delivery;
    @ManyToOne
    @JoinColumn(name = "CargoID", referencedColumnName = "CargoID", nullable = false)
    private Cargo cargoByCargo;
    @ManyToOne
    @JoinColumn(name = "DeliveryID", referencedColumnName = "DeliveryID", nullable = false)
    private Delivery deliveryByDelivery;

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
        CargoDelivery that = (CargoDelivery) o;
        return Objects.equals(cargo, that.cargo) && Objects.equals(delivery, that.delivery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargo, delivery);
    }

    public Cargo getCargoByCargo() {
        return cargoByCargo;
    }

    public void setCargoByCargo(Cargo cargoByCargo) {
        this.cargoByCargo = cargoByCargo;
    }

    public Delivery getDeliveryByDelivery() {
        return deliveryByDelivery;
    }

    public void setDeliveryByDelivery(Delivery deliveryByDelivery) {
        this.deliveryByDelivery = deliveryByDelivery;
    }
}
