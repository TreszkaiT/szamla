package com.tresz.szamla.repository;

import com.tresz.szamla.datas.entity.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
