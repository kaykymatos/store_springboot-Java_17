package com.kayky.storejava.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kayky.storejava.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll() {
		User newUser = new User(1L, "João", "joao@gmail.com", "(11) 12345-6789", "12345678");
		return ResponseEntity.ok().body(newUser);
	}
}
