package com.le30r.practice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Tariff {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TariffID")
    private Integer tariffId;
    @Basic
    @Column(name = "TariffName")
    private String tariffName;
    @Basic
    @Column(name = "Rate")
    private float rate;
    @Basic
    @Column(name = "Fragile")
    private Boolean fragile;
    @Basic
    @Column(name = "Toxic")
    private Boolean toxic;

    public Integer getTariffId() {
        return tariffId;
    }

    public void setTariffId(Integer tariffId) {
        this.tariffId = tariffId;
    }

    public String getTariffName() {
        return tariffName;
    }

    public void setTariffName(String tariffName) {
        this.tariffName = tariffName;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }

    public Boolean getFragile() {
        return fragile;
    }

    public void setFragile(Boolean fragile) {
        this.fragile = fragile;
    }

    public Boolean getToxic() {
        return toxic;
    }

    public void setToxic(Boolean toxic) {
        this.toxic = toxic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tariff tariff = (Tariff) o;
        return Objects.equals(tariffId, tariff.tariffId) && Objects.equals(tariffName, tariff.tariffName) && Objects.equals(rate, tariff.rate) && Objects.equals(fragile, tariff.fragile) && Objects.equals(toxic, tariff.toxic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tariffId, tariffName, rate, fragile, toxic);
    }
}
