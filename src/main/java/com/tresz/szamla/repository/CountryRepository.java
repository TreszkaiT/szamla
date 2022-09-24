package com.tresz.szamla.repository;

import com.tresz.szamla.datas.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
