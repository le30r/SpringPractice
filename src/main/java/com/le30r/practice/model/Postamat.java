package com.le30r.practice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Postamat {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "PostamatID")
    private Integer postamatId;
    @Basic
    @Column(name = "City")
    private Integer city;
    @Basic
    @Column(name = "PostamatAddress")
    private String postamatAddress;
    @Basic
    @Column(name = "Capacity")
    private Integer capacity;
    @ManyToOne
    @JoinColumn(name = "CityID", referencedColumnName = "CityID", nullable = false)
    private City cityByCity;

    public Integer getPostamatId() {
        return postamatId;
    }

    public void setPostamatId(Integer postamatId) {
        this.postamatId = postamatId;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getPostamatAddress() {
        return postamatAddress;
    }

    public void setPostamatAddress(String postamatAddress) {
        this.postamatAddress = postamatAddress;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Postamat postamat = (Postamat) o;
        return Objects.equals(postamatId, postamat.postamatId) && Objects.equals(city, postamat.city) && Objects.equals(postamatAddress, postamat.postamatAddress) && Objects.equals(capacity, postamat.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postamatId, city, postamatAddress, capacity);
    }

    public City getCityByCity() {
        return cityByCity;
    }

    public void setCityByCity(City cityByCity) {
        this.cityByCity = cityByCity;
    }
}
