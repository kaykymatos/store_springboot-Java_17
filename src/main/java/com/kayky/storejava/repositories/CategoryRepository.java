package com.kayky.storejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayky.storejava.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
