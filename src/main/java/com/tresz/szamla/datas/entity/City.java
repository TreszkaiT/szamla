package com.tresz.szamla.datas.entity;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Table(name = "SZML_CITY")
public class City {

    @Id
    @GeneratedValue
    @Column(name = "CTY_ID")
    private Long Id;

    @Column(name = "CTY_NAME")
    private String name;

    @Column(name = "CTY_ZIP")
    private Integer zip;

    @OneToOne(mappedBy = "city")
    private Partner partner;

    public City() {
    }

    public Long getId() {
        return Id;
    }

    public City setId(Long id) {
        Id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public City setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getZip() {
        return zip;
    }

    public City setZip(Integer zip) {
        this.zip = zip;
        return this;
    }

    public Partner getPartner() {
        return partner;
    }

    public City setPartner(Partner partner) {
        this.partner = partner;
        return this;
    }
}
