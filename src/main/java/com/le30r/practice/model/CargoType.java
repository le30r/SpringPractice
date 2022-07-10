package com.le30r.practice.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "CargoType")
@Table(name = "CargoType")
public class CargoType {

    @Id
    @Column(name = "TypeID")
    private Integer id;

    @Column(name = "TypeName")
    private String name;

    public CargoType() {
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
}
