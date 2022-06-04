package com.kayky.storejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayky.storejava.entities.OrderItem;
import com.kayky.storejava.repositories.OrderItemRepository;

@Service
public class OrderItemService {
	@Autowired
	public OrderItemRepository repository;

	public List<OrderItem> findAll() {
		return repository.findAll();
	}

	public OrderItem findById(Long id) {
		Optional<OrderItem> obj = repository.findById(id);
		return obj.get();
	}

}
