package com.tresz.szamla.repository;

import com.tresz.szamla.datas.entity.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
