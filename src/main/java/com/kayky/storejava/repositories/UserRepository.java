package com.kayky.storejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kayky.storejava.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
