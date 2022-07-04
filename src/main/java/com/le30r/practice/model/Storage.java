package com.le30r.practice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Storage {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "StorageID")
    private Integer storageId;
    @Basic
    @Column(name = "StorageName")
    private String storageName;
    @Basic
    @Column(name = "Capacity")
    private Integer capacity;
    @Basic
    @Column(name = "City")
    private Integer city;
    @Basic
    @Column(name = "StorageAddress")
    private String storageAddress;
    @ManyToOne
    @JoinColumn(name = "CityID", referencedColumnName = "CityID", nullable = false)
    private City cityByCity;

    public Integer getStorageId() {
        return storageId;
    }

    public void setStorageId(Integer storageId) {
        this.storageId = storageId;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getStorageAddress() {
        return storageAddress;
    }

    public void setStorageAddress(String storageAddress) {
        this.storageAddress = storageAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(storageId, storage.storageId) && Objects.equals(storageName, storage.storageName) && Objects.equals(capacity, storage.capacity) && Objects.equals(city, storage.city) && Objects.equals(storageAddress, storage.storageAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storageId, storageName, capacity, city, storageAddress);
    }

    public City getCityByCity() {
        return cityByCity;
    }

    public void setCityByCity(City cityByCity) {
        this.cityByCity = cityByCity;
    }
}
