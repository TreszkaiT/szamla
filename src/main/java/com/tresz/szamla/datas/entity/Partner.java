package com.tresz.szamla.datas.entity;

import org.hibernate.envers.Audited;

import javax.annotation.WillClose;
import javax.persistence.*;

@Entity
@Audited
@DiscriminatorColumn( name = "ITM_TYPE" )
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "SZML_PARTNER")
public class Partner extends AbstractEntity{

    @Id
    @SequenceGenerator(name = "SEQ_JPA_PARTNER", sequenceName = "SEQ_JPA_PARTNER", initialValue = 100000, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_JPA_PARTNER")
    @Column(name = "PRT_ID")
    private Long id;

    @Column(name = "PRT_FIRST_NAME")
    private String firstName;

    @Column(name = "PRT_LAST_NAME")
    private String lastName;

    @OneToOne
    private Country country;
    @OneToOne
    private City city;

    @Column(name = "PRT_KERULET")
    private Integer kerulet;
    @Column(name = "PRT_KOZTERULET_NEVE")
    private String kozteruletNeve;
    @Column(name = "PRT_KOZTERULET_JELLEGE")
    private String kozteruletJellege;
    @Column(name = "PRT_HAZSZAM")
    private String hazszam;
    @Column(name = "PRT_EPULET")
    private String epulet;
    @Column(name = "PRT_LEPCSOHAZ")
    private String lepcsohaz;
    @Column(name = "PRT_SZINT")
    private String szint;
    @Column(name = "PRT_AJTO")
    private String ajto;

    @Column(name = "PRT_BANK_NUMBER1")
    private Integer bankNumber1;
    @Column(name = "PRT_BANK_NUMBER2")
    private Integer bankNumber2;
    @Column(name = "PRT_BANK_NUMBER3")
    private Integer bankNumber3;

    @Column(name = "PRT_ADOSZAM1")
    private Integer adoszam1;
    @Column(name = "PRT_ADOSZAM2")
    private Integer adoszam2;
    @Column(name = "PRT_ADOSZAM3")
    private Integer adoszam3;

    @Column(name = "PRT_CONTACT_HOLDER1")
    private String contactHolder1;
    @Column(name = "PRT_PHONE11")
    private Integer phone11;
    @Column(name = "PRT_PHONE12")
    private Integer phone12;
    @Column(name = "PRT_EMAIL1")
    private String email1;

    @Column(name = "PRT_CONTACT_HOLDER2")
    private String contactHolder2;
    @Column(name = "PRT_PHONE21")
    private Integer phone21;
    @Column(name = "PRT_PHONE22")
    private Integer phone22;
    @Column(name = "PRT_EMAIL2")
    private String email2;



    public Partner() {
    }

    public Long getId() {
        return id;
    }

    public Partner setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Partner setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Partner setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Country getCountry() {
        return country;
    }

    public Partner setCountry(Country country) {
        this.country = country;
        return this;
    }

    public City getCity() {
        return city;
    }

    public Partner setCity(City city) {
        this.city = city;
        return this;
    }
}
