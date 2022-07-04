package com.le30r.practice.model;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.Objects;

@Entity
public class Cargo {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CargoID")
    private Integer cargoId;
    @Basic
    @Column(name = "CargoType")
    private Integer cargoType;
    @Basic
    @Column(name = "CargoName")
    private String cargoName;
    @Basic
    @Column(name = "Storage")
    private Integer storage;
    @Basic
    @Column(name = "Shipper")
    private Integer shipper;
    @Basic
    @Column(name = "ArrivalDate")
    private Date arrivalDate;
    @Basic
    @Column(name = "ArrivalTime")
    private Time arrivalTime;
    @Basic
    @Column(name = "CargoWeight")
    private Float cargoWeight;
    @Basic
    @Column(name = "Height")
    private Float height;
    @Basic
    @Column(name = "Width")
    private Float width;
    @Basic
    @Column(name = "Depth")
    private Float depth;
    @ManyToOne
    @JoinColumn(name = "CargoTypeID", referencedColumnName = "TypeID", nullable = false)
    private CargoType cargoTypeByCargoType;
    @ManyToOne
    @JoinColumn(name = "StorageID", referencedColumnName = "StorageID")
    private Storage storageByStorage;
    @ManyToOne
    @JoinColumn(name = "ShipperID", referencedColumnName = "ClientID", nullable = false)
    private Client clientByShipper;

    public Integer getCargoId() {
        return cargoId;
    }

    public void setCargoId(Integer cargoId) {
        this.cargoId = cargoId;
    }

    public Integer getCargoType() {
        return cargoType;
    }

    public void setCargoType(Integer cargoType) {
        this.cargoType = cargoType;
    }

    public String getCargoName() {
        return cargoName;
    }

    public void setCargoName(String cargoName) {
        this.cargoName = cargoName;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }

    public Integer getShipper() {
        return shipper;
    }

    public void setShipper(Integer shipper) {
        this.shipper = shipper;
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

    public Float getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(Float cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Float getWidth() {
        return width;
    }

    public void setWidth(Float width) {
        this.width = width;
    }

    public Float getDepth() {
        return depth;
    }

    public void setDepth(Float depth) {
        this.depth = depth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cargo cargo = (Cargo) o;
        return Objects.equals(cargoId, cargo.cargoId) && Objects.equals(cargoType, cargo.cargoType) && Objects.equals(cargoName, cargo.cargoName) && Objects.equals(storage, cargo.storage) && Objects.equals(shipper, cargo.shipper) && Objects.equals(arrivalDate, cargo.arrivalDate) && Objects.equals(arrivalTime, cargo.arrivalTime) && Objects.equals(cargoWeight, cargo.cargoWeight) && Objects.equals(height, cargo.height) && Objects.equals(width, cargo.width) && Objects.equals(depth, cargo.depth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargoId, cargoType, cargoName, storage, shipper, arrivalDate, arrivalTime, cargoWeight, height, width, depth);
    }

    public CargoType getCargoTypeByCargoType() {
        return cargoTypeByCargoType;
    }

    public void setCargoTypeByCargoType(CargoType cargoTypeByCargoType) {
        this.cargoTypeByCargoType = cargoTypeByCargoType;
    }

    public Storage getStorageByStorage() {
        return storageByStorage;
    }

    public void setStorageByStorage(Storage storageByStorage) {
        this.storageByStorage = storageByStorage;
    }

    public Client getClientByShipper() {
        return clientByShipper;
    }

    public void setClientByShipper(Client clientByShipper) {
        this.clientByShipper = clientByShipper;
    }
}
