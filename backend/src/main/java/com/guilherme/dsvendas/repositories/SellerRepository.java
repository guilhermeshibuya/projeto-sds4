package com.guilherme.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
