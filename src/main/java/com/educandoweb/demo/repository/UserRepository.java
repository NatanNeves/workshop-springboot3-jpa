package com.educandoweb.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
