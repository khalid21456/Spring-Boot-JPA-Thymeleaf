package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Models.Userr;

public interface UserDAO extends JpaRepository<Userr, Long>{
	

}
