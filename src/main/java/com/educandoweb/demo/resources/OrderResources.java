package com.educandoweb.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.demo.entities.Order;
import com.educandoweb.demo.services.OrderServices;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {
	
	@Autowired
	private OrderServices service;

	@GetMapping
	public ResponseEntity<List<Order>> findAll(){		
		List<Order> list = service.findAll();		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long Id){
		Order obj = service.findById(Id);
		return ResponseEntity.ok().body(obj);
	}
}
