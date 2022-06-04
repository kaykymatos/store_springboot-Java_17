package com.kayky.storejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayky.storejava.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
