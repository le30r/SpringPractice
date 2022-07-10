package com.le30r.practice.model;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;

@Entity
@Table(name = "Storage")
public class Storage {
    @Id
    @Column(name = "StorageID")
    private Integer id;

    @Nationalized
    @Column(name = "StorageName")
    private String name;

    @Nationalized
    @Column(name = "StorageAddress")
    private String address;

    @ManyToOne
    @JoinColumn(name = "City")
    private City city;

}
