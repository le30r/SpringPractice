package com.le30r.practice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class CargoType {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TypeID")
    private Integer typeId;
    @Basic
    @Column(name = "TypeName")
    private String typeName;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CargoType cargoType = (CargoType) o;
        return Objects.equals(typeId, cargoType.typeId) && Objects.equals(typeName, cargoType.typeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId, typeName);
    }
}
