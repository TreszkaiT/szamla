package com.tresz.szamla.datas.entity;

import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Audited
@Table(name = "SZLA_INVOICE")
public class Invoice {                          // számla

    @Id
    @GeneratedValue
    @Column(name = "INV_ID")
    private Long id;

    @Enumerated(EnumType.ORDINAL)               // sorszáma
    private InvoiceType invoiceType;

    @Column(name = "INV_RECEIPT_NUMBER")        // bizonylat száma
    private String receiptNumber;

    @Column(name = "INV_RECEIPT_NUMBER_UNIQUE")        // bizonylat száma
    private String receiptNumberUnique;

    @OneToOne
    private Currency currency;

    public Invoice() {
    }

    public Long getId() {
        return id;
    }

    public Invoice setId(Long id) {
        this.id = id;
        return this;
    }

    public InvoiceType getInvoiceType() {
        return invoiceType;
    }

    public Invoice setInvoiceType(InvoiceType invoiceType) {
        this.invoiceType = invoiceType;
        return this;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    public Invoice setReceiptNumber(String receiptNumber) {
        this.receiptNumber = receiptNumber;
        return this;
    }

    public String getReceiptNumberUnique() {
        return receiptNumberUnique;
    }

    public Invoice setReceiptNumberUnique(String receiptNumberUnique) {
        this.receiptNumberUnique = receiptNumberUnique;
        return this;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Invoice setCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }
}
