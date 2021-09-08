package com.guilherme.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
