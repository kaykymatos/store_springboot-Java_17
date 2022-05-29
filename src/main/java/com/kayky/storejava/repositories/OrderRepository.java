package com.kayky.storejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayky.storejava.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
