package com.tresz.szamla;

import com.tresz.szamla.datas.entity.City;
import com.tresz.szamla.datas.entity.Country;
import com.tresz.szamla.datas.entity.Partner;
import com.tresz.szamla.repository.CityRepository;
import com.tresz.szamla.repository.CountryRepository;
import com.tresz.szamla.repository.PartnerRepository;
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
    }

}
