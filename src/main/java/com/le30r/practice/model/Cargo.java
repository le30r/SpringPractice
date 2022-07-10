package com.le30r.practice.model;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "Cargo")
public class Cargo {

    @Id
    @Column(name = "CargoID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "CargoName", nullable = true, length = 50)
    private String name;

    @Column(name = "CargoWeight", nullable = false)
    private Double weight;

    @ManyToOne
    @JoinColumn(name = "CargoType", nullable = false)
    private CargoType type;

    @ManyToOne
    @JoinColumn(name = "Storage", nullable = true)
    private Storage storage;

    @ManyToOne
    @JoinColumn(name = "Shipper", nullable = false)
    private Client client;

    @Column(name = "ArrivalDate", nullable = false)
    private Date arrivalDate;

    @Column(name = "ArrivalTime", nullable = false)
    private Time arrivalTime;

    @Column(name = "Height", nullable = false)
    private Double height;

    @Column(name = "Width", nullable = false)
    private Double width;

    @Column(name = "Depth", nullable = false)
    private Double depth;

    public Cargo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public CargoType getType() {
        return type;
    }

    public void setType(CargoType type) {
        this.type = type;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }
}
