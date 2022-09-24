package com.tresz.szamla.datas.entity;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Table(name = "SZLA_CURRENCY")
public class Currency {         // pénznem

    @Id
    @GeneratedValue
    @Column(name = "CUR_ID")
    private Long id;

    @Column(name = "CUR_NAME")
    private String name;

    @Column(name = "CUR_SHOR_NAME")
    private String shortName;

    @OneToOne(mappedBy = "currency")
    private Invoice invoice;

    public Currency() {
    }

    public Long getId() {
        return id;
    }

    public Currency setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Currency setName(String name) {
        this.name = name;
        return this;
    }

    public String getShortName() {
        return shortName;
    }

    public Currency setShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public Currency setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }
}
