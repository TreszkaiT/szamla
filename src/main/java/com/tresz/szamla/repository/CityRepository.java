package com.tresz.szamla.repository;

import com.tresz.szamla.datas.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
