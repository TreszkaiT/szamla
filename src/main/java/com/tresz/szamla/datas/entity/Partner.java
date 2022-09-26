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

    @Column(name = "PRT_DISTRICT")                      // kerület
    private Integer district;
    @Column(name = "PRT_PUBLIC_AREA_NAME")              // közterület neve
    private String publicAreaName;
    @Column(name = "PRT_PUBLIC_AREA_NATURE")            // közterület jellege
    private String publicAreaNature;
    @Column(name = "PRT_HOUSE_NUMBER")                  // házszám
    private String houseNumber;
    @Column(name = "PRT_BUILDING")                      // épület
    private String building;
    @Column(name = "PRT_STAIR_WAY")                     // lépcsőház
    private String stairWay;
    @Column(name = "PRT_GROUND")                        // szint
    private String ground;
    @Column(name = "PRT_DOOR")                          // ajtó
    private String door;

    @Column(name = "PRT_BANK_NUMBER1")
    private Integer bankNumber1;
    @Column(name = "PRT_BANK_NUMBER2")
    private Integer bankNumber2;
    @Column(name = "PRT_BANK_NUMBER3")
    private Integer bankNumber3;

    @Column(name = "PRT_TAX_NUMBER1")
    private Integer taxNumber1;
    @Column(name = "PRT_TAX_NUMBER2")
    private Integer taxNumber2;
    @Column(name = "PRT_TAX_NUMBER3")
    private Integer taxNumber3;

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

    @OneToOne(mappedBy = "partner")
    private Invoice invoice;



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

    public Integer getDistrict() {
        return district;
    }

    public Partner setDistrict(Integer district) {
        this.district = district;
        return this;
    }

    public String getPublicAreaName() {
        return publicAreaName;
    }

    public Partner setPublicAreaName(String publicAreaName) {
        this.publicAreaName = publicAreaName;
        return this;
    }

    public String getPublicAreaNature() {
        return publicAreaNature;
    }

    public Partner setPublicAreaNature(String publicAreaNature) {
        this.publicAreaNature = publicAreaNature;
        return this;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public Partner setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
        return this;
    }

    public String getBuilding() {
        return building;
    }

    public Partner setBuilding(String building) {
        this.building = building;
        return this;
    }

    public String getStairWay() {
        return stairWay;
    }

    public Partner setStairWay(String stairWay) {
        this.stairWay = stairWay;
        return this;
    }

    public String getGround() {
        return ground;
    }

    public Partner setGround(String ground) {
        this.ground = ground;
        return this;
    }

    public String getDoor() {
        return door;
    }

    public Partner setDoor(String door) {
        this.door = door;
        return this;
    }

    public Integer getBankNumber1() {
        return bankNumber1;
    }

    public Partner setBankNumber1(Integer bankNumber1) {
        this.bankNumber1 = bankNumber1;
        return this;
    }

    public Integer getBankNumber2() {
        return bankNumber2;
    }

    public Partner setBankNumber2(Integer bankNumber2) {
        this.bankNumber2 = bankNumber2;
        return this;
    }

    public Integer getBankNumber3() {
        return bankNumber3;
    }

    public Partner setBankNumber3(Integer bankNumber3) {
        this.bankNumber3 = bankNumber3;
        return this;
    }

    public Integer getTaxNumber1() {
        return taxNumber1;
    }

    public Partner setTaxNumber1(Integer taxNumber1) {
        this.taxNumber1 = taxNumber1;
        return this;
    }

    public Integer getTaxNumber2() {
        return taxNumber2;
    }

    public Partner setTaxNumber2(Integer taxNumber2) {
        this.taxNumber2 = taxNumber2;
        return this;
    }

    public Integer getTaxNumber3() {
        return taxNumber3;
    }

    public Partner setTaxNumber3(Integer taxNumber3) {
        this.taxNumber3 = taxNumber3;
        return this;
    }

    public String getContactHolder1() {
        return contactHolder1;
    }

    public Partner setContactHolder1(String contactHolder1) {
        this.contactHolder1 = contactHolder1;
        return this;
    }

    public Integer getPhone11() {
        return phone11;
    }

    public Partner setPhone11(Integer phone11) {
        this.phone11 = phone11;
        return this;
    }

    public Integer getPhone12() {
        return phone12;
    }

    public Partner setPhone12(Integer phone12) {
        this.phone12 = phone12;
        return this;
    }

    public String getEmail1() {
        return email1;
    }

    public Partner setEmail1(String email1) {
        this.email1 = email1;
        return this;
    }

    public String getContactHolder2() {
        return contactHolder2;
    }

    public Partner setContactHolder2(String contactHolder2) {
        this.contactHolder2 = contactHolder2;
        return this;
    }

    public Integer getPhone21() {
        return phone21;
    }

    public Partner setPhone21(Integer phone21) {
        this.phone21 = phone21;
        return this;
    }

    public Integer getPhone22() {
        return phone22;
    }

    public Partner setPhone22(Integer phone22) {
        this.phone22 = phone22;
        return this;
    }

    public String getEmail2() {
        return email2;
    }

    public Partner setEmail2(String email2) {
        this.email2 = email2;
        return this;
    }
}
