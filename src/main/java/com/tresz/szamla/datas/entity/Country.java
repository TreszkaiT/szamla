package com.tresz.szamla.datas.entity;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Table(name = "SZML_COUNTRY")
public class Country {

    @Id
    @GeneratedValue
    @Column(name = "CNT_ID")
    private Long id;

    @Column(name = "CNT_NAME")
    private String name;

    @OneToOne(mappedBy = "country")
    private Partner partner;

    public Country() {
    }

    public Long getId() {
        return id;
    }

    public Country setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        return this;
    }

    public Partner getPartner() {
        return partner;
    }

    public Country setPartner(Partner partner) {
        this.partner = partner;
        return this;
    }
}

