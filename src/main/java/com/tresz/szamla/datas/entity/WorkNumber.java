package com.tresz.szamla.datas.entity;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Table(name = "SZLA_WORK_NUMBER")
public class WorkNumber {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "WRK_NUMBER1")
    private String number1;
    @Column(name = "WRK_NUMBER2")
    private String number2;
    @Column(name = "WRK_NUMBER3")
    private String number3;
    @Column(name = "WRK_NUMBER4")
    private String number4;
    @Column(name = "WRK_NUMBER5")
    private String number5;

    @ManyToOne
    private Invoice invoice;

    public WorkNumber() {
    }

    public Long getId() {
        return id;
    }

    public WorkNumber setId(Long id) {
        this.id = id;
        return this;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public WorkNumber setInvoice(Invoice invoice) {
        this.invoice = invoice;
        return this;
    }

    public String getNumber1() {
        return number1;
    }

    public WorkNumber setNumber1(String number1) {
        this.number1 = number1;
        return this;
    }

    public String getNumber2() {
        return number2;
    }

    public WorkNumber setNumber2(String number2) {
        this.number2 = number2;
        return this;
    }

    public String getNumber3() {
        return number3;
    }

    public WorkNumber setNumber3(String number3) {
        this.number3 = number3;
        return this;
    }

    public String getNumber4() {
        return number4;
    }

    public WorkNumber setNumber4(String number4) {
        this.number4 = number4;
        return this;
    }

    public String getNumber5() {
        return number5;
    }

    public WorkNumber setNumber5(String number5) {
        this.number5 = number5;
        return this;
    }
}
