package com.kayky.storejava.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayky.storejava.entities.User;
import com.kayky.storejava.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	public UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id){
		Optional<User> obj= repository.findById(id);
		return obj.get();
	}

}
