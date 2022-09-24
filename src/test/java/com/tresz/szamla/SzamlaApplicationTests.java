package com.tresz.szamla;

import com.tresz.szamla.datas.entity.Country;
import com.tresz.szamla.datas.entity.Partner;
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

    @Test
    void contextLoads() {
        Country country = new Country();
        country.setName("Hungary");
        countryRepository.save(country);

        Partner partner = new Partner();
        partner.setCountry(country);
        partner.setFirstName("Nagy").setLastName("Géza");
        partnerRepository.save(partner);
    }

}
