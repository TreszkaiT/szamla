package com.tresz.szamla.datas.entity;

import com.tresz.szamla.datas.entity.enums.InvoiceType;
import com.tresz.szamla.datas.entity.enums.Payment;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

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
    private Currency currency;                  // pénznem

    @OneToOne
    private Partner partner;


    @Enumerated(EnumType.ORDINAL)
    private Payment payment;

    @CreatedDate
    @Column(name = "INV_INVOICE_DATE")
    private LocalDateTime invoiceDate;          // számla kelte

    @CreatedDate
    @Column(name = "INV_COMPLETION_DATE")
    private LocalDateTime completionDate;          // teljesítés dátuma

    @CreatedDate
    @Column(name = "INV_PAYMENT_DEADLINE")
    private LocalDateTime paymentDeadline;          // fizetési határidő

    @Column(name = "INV_GROSS_INVOICE_AMOUNT")
    private Integer grossInvoiceAmount;             // számla bruttó összege

    @Column(name = "INV_PAID_OUT")
    private Boolean paidOut;                        // kiegyenlített

    @OneToMany(mappedBy = "invoice")
//    @Column(name = "INV_WORK_NUMBERS")
    private List<WorkNumber> workNumbers;           // munkaszám

    @Column(name = "INV_COMMENT")
    private String comment;

    @Column(name = "INV_FILE_NAME")
    private String fileName;

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

    public Partner getPartner() {
        return partner;
    }

    public Invoice setPartner(Partner partner) {
        this.partner = partner;
        return this;
    }

    public Payment getPayment() {
        return payment;
    }

    public Invoice setPayment(Payment payment) {
        this.payment = payment;
        return this;
    }

    public LocalDateTime getInvoiceDate() {
        return invoiceDate;
    }

    public Invoice setInvoiceDate(LocalDateTime invoiceDate) {
        this.invoiceDate = invoiceDate;
        return this;
    }

    public LocalDateTime getCompletionDate() {
        return completionDate;
    }

    public Invoice setCompletionDate(LocalDateTime completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    public LocalDateTime getPaymentDeadline() {
        return paymentDeadline;
    }

    public Invoice setPaymentDeadline(LocalDateTime paymentDeadline) {
        this.paymentDeadline = paymentDeadline;
        return this;
    }

    public Integer getGrossInvoiceAmount() {
        return grossInvoiceAmount;
    }

    public Invoice setGrossInvoiceAmount(Integer grossInvoiceAmount) {
        this.grossInvoiceAmount = grossInvoiceAmount;
        return this;
    }

    public Boolean getPaidOut() {
        return paidOut;
    }

    public Invoice setPaidOut(Boolean paidOut) {
        this.paidOut = paidOut;
        return this;
    }

    public List<WorkNumber> getWorkNumbers() {
        return workNumbers;
    }

    public Invoice setWorkNumbers(List<WorkNumber> workNumbers) {
        this.workNumbers = workNumbers;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Invoice setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public Invoice setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
}
