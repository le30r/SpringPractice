package com.le30r.practice.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Courier {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "CourierID")
    private Integer courierId;
    @Basic
    @Column(name = "FirstName")
    private String firstName;
    @Basic
    @Column(name = "MiddleName")
    private String middleName;
    @Basic
    @Column(name = "LastName")
    private String lastName;
    @Basic
    @Column(name = "Birthday")
    private Date birthday;
    @Basic
    @Column(name = "Phone")
    private String phone;
    @Basic
    @Column(name = "PartnerCompany")
    private Integer partnerCompany;
    @Basic
    @Column(name = "City")
    private Integer city;
    @Basic
    @Column(name = "District")
    private String district;
    @Basic
    @Column(name = "Car")
    private Boolean car;
    @OneToOne
    @JoinColumn(name = "CourierID", referencedColumnName = "ID", nullable = false)
    private User usersByCourierId;
    @ManyToOne
    @JoinColumn(name = "PartnerCompanyID", referencedColumnName = "CompanyID")
    private PartnerCompany partnerCompanyByPartnerCompany;
    @ManyToOne
    @JoinColumn(name = "CityID", referencedColumnName = "CityID", nullable = false)
    private City cityByCity;

    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPartnerCompany() {
        return partnerCompany;
    }

    public void setPartnerCompany(Integer partnerCompany) {
        this.partnerCompany = partnerCompany;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Boolean getCar() {
        return car;
    }

    public void setCar(Boolean car) {
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courier courier = (Courier) o;
        return Objects.equals(courierId, courier.courierId) && Objects.equals(firstName, courier.firstName) && Objects.equals(middleName, courier.middleName) && Objects.equals(lastName, courier.lastName) && Objects.equals(birthday, courier.birthday) && Objects.equals(phone, courier.phone) && Objects.equals(partnerCompany, courier.partnerCompany) && Objects.equals(city, courier.city) && Objects.equals(district, courier.district) && Objects.equals(car, courier.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courierId, firstName, middleName, lastName, birthday, phone, partnerCompany, city, district, car);
    }

    public User getUsersByCourierId() {
        return usersByCourierId;
    }

    public void setUsersByCourierId(User usersByCourierId) {
        this.usersByCourierId = usersByCourierId;
    }

    public PartnerCompany getPartnerCompanyByPartnerCompany() {
        return partnerCompanyByPartnerCompany;
    }

    public void setPartnerCompanyByPartnerCompany(PartnerCompany partnerCompanyByPartnerCompany) {
        this.partnerCompanyByPartnerCompany = partnerCompanyByPartnerCompany;
    }

    public City getCityByCity() {
        return cityByCity;
    }

    public void setCityByCity(City cityByCity) {
        this.cityByCity = cityByCity;
    }
}
