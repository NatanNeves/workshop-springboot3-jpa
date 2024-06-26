package com.educandoweb.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.demo.entities.User;
import com.educandoweb.demo.services.UserServices;

@RestController
@RequestMapping(value = "/users")
public class UserResources {
	
	@Autowired
	private UserServices service;

	@GetMapping
	public ResponseEntity<List<User>> findAll(){		
		List<User> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long Id){
		User obj = service.findById(Id);
		return ResponseEntity.ok().body(obj);
	}
}
