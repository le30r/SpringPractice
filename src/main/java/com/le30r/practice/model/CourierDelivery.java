package com.le30r.practice.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
@IdClass(CourierDeliveryPK.class)
public class CourierDelivery {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Courier")
    private Integer courier;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Delivery")
    private Integer delivery;
    @Basic
    @Column(name = "IssueDate")
    private Date issueDate;
    @Basic
    @Column(name = "IssueTime")
    private Time issueTime;
    @ManyToOne
    @JoinColumn(name = "CourierID", referencedColumnName = "CourierID", nullable = false)
    private Courier courierByCourier;
    @ManyToOne
    @JoinColumn(name = "DeliveryID", referencedColumnName = "DeliveryID", nullable = false)
    private Delivery deliveryByDelivery;

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

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Time getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(Time issueTime) {
        this.issueTime = issueTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourierDelivery that = (CourierDelivery) o;
        return Objects.equals(courier, that.courier) && Objects.equals(delivery, that.delivery) && Objects.equals(issueDate, that.issueDate) && Objects.equals(issueTime, that.issueTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courier, delivery, issueDate, issueTime);
    }

    public Courier getCourierByCourier() {
        return courierByCourier;
    }

    public void setCourierByCourier(Courier courierByCourier) {
        this.courierByCourier = courierByCourier;
    }

    public Delivery getDeliveryByDelivery() {
        return deliveryByDelivery;
    }

    public void setDeliveryByDelivery(Delivery deliveryByDelivery) {
        this.deliveryByDelivery = deliveryByDelivery;
    }
}
