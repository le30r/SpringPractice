package com.le30r.practice.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Delivery {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DeliveryID")
    private Integer deliveryId;
    @Basic
    @Column(name = "Receiver")
    private Integer receiver;
    @Basic
    @Column(name = "DeliveryCity")
    private Integer deliveryCity;
    @Basic
    @Column(name = "DeliveryAddress")
    private String deliveryAddress;
    @Basic
    @Column(name = "Postamat")
    private Integer postamat;
    @Basic
    @Column(name = "DeliveryDate")
    private Date deliveryDate;
    @Basic
    @Column(name = "DeliveryTime")
    private Time deliveryTime;
    @Basic
    @Column(name = "DeliveryStatus")
    private Integer deliveryStatus;
    @Basic
    @Column(name = "Tariff")
    private Integer tariff;
    @Basic
    @Column(name = "Price")
    private float price;
    @ManyToOne
    @JoinColumn(name = "ReceiverID", referencedColumnName = "ClientID", nullable = false)
    private Client clientByReceiver;
    @ManyToOne
    @JoinColumn(name = "DeliveryCityID", referencedColumnName = "CityID", nullable = false)
    private City cityByDeliveryCity;
    @ManyToOne
    @JoinColumn(name = "PostamatID", referencedColumnName = "PostamatID")
    private Postamat postamatByPostamat;
    @ManyToOne
    @JoinColumn(name = "DeliveryStatusID", referencedColumnName = "StatusID")
    private DeliveryStatus deliveryStatusByDeliveryStatus;
    @ManyToOne
    @JoinColumn(name = "TariffID", referencedColumnName = "TariffID")
    private Tariff tariffByTariff;

    public Integer getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Integer deliveryId) {
        this.deliveryId = deliveryId;
    }

    public Integer getReceiver() {
        return receiver;
    }

    public void setReceiver(Integer receiver) {
        this.receiver = receiver;
    }

    public Integer getDeliveryCity() {
        return deliveryCity;
    }

    public void setDeliveryCity(Integer deliveryCity) {
        this.deliveryCity = deliveryCity;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public Integer getPostamat() {
        return postamat;
    }

    public void setPostamat(Integer postamat) {
        this.postamat = postamat;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Time getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Time deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(Integer deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public Integer getTariff() {
        return tariff;
    }

    public void setTariff(Integer tariff) {
        this.tariff = tariff;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Delivery delivery = (Delivery) o;
        return Objects.equals(deliveryId, delivery.deliveryId) && Objects.equals(receiver, delivery.receiver) && Objects.equals(deliveryCity, delivery.deliveryCity) && Objects.equals(deliveryAddress, delivery.deliveryAddress) && Objects.equals(postamat, delivery.postamat) && Objects.equals(deliveryDate, delivery.deliveryDate) && Objects.equals(deliveryTime, delivery.deliveryTime) && Objects.equals(deliveryStatus, delivery.deliveryStatus) && Objects.equals(tariff, delivery.tariff) && Objects.equals(price, delivery.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deliveryId, receiver, deliveryCity, deliveryAddress, postamat, deliveryDate, deliveryTime, deliveryStatus, tariff, price);
    }

    public Client getClientByReceiver() {
        return clientByReceiver;
    }

    public void setClientByReceiver(Client clientByReceiver) {
        this.clientByReceiver = clientByReceiver;
    }

    public City getCityByDeliveryCity() {
        return cityByDeliveryCity;
    }

    public void setCityByDeliveryCity(City cityByDeliveryCity) {
        this.cityByDeliveryCity = cityByDeliveryCity;
    }

    public Postamat getPostamatByPostamat() {
        return postamatByPostamat;
    }

    public void setPostamatByPostamat(Postamat postamatByPostamat) {
        this.postamatByPostamat = postamatByPostamat;
    }

    public DeliveryStatus getDeliveryStatusByDeliveryStatus() {
        return deliveryStatusByDeliveryStatus;
    }

    public void setDeliveryStatusByDeliveryStatus(DeliveryStatus deliveryStatusByDeliveryStatus) {
        this.deliveryStatusByDeliveryStatus = deliveryStatusByDeliveryStatus;
    }

    public Tariff getTariffByTariff() {
        return tariffByTariff;
    }

    public void setTariffByTariff(Tariff tariffByTariff) {
        this.tariffByTariff = tariffByTariff;
    }
}
