package com.kayky.storejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayky.storejava.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
