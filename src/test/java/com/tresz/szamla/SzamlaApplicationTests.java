package com.tresz.szamla;

import com.tresz.szamla.datas.entity.*;
import com.tresz.szamla.datas.entity.enums.InvoiceType;
import com.tresz.szamla.datas.entity.enums.Payment;
import com.tresz.szamla.repository.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SzamlaApplicationTests {

    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private PartnerRepository partnerRepository;
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private CurrencyRepository currencyRepository;

    @Test
    void contextLoads() {
        Country country = new Country();
        country.setName("Hungary");
        countryRepository.save(country);

        City city = new City();
        city.setName("Nyíregyháza").setZip(4400);
        cityRepository.save(city);

        Partner partner = new Partner();
        partner.setCountry(country);
        partner.setCity(city);
        partner.setFirstName("Nagy").setLastName("Géza");
        partnerRepository.save(partner);


//        -----------------------
        Invoice invoice = new Invoice();
        invoice.setInvoiceType(InvoiceType.VEVO);

        Currency currency = new Currency();
        currency.setName("Forint").setShortName("HUF");
        invoice.setCurrency(currency);
        currencyRepository.save(currency);

//        invoice.setPartner(partner);
//        partnerRepository.save(partner);

        invoice.setPayment(Payment.KESZPENZ);

        invoice.setPaidOut(true);

        invoiceRepository.save(invoice);
    }

}
