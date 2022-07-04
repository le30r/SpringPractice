package com.le30r.practice.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class PartnerCompany {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CompanyID")
    private Integer companyId;
    @Basic
    @Column(name = "CompanyName")
    private String companyName;
    @Basic
    @Column(name = "Phone")
    private String phone;
    @Basic
    @Column(name = "LegalAddress")
    private String legalAddress;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartnerCompany that = (PartnerCompany) o;
        return Objects.equals(companyId, that.companyId) && Objects.equals(companyName, that.companyName) && Objects.equals(phone, that.phone) && Objects.equals(legalAddress, that.legalAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(companyId, companyName, phone, legalAddress);
    }
}
