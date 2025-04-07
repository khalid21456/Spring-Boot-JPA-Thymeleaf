package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.UserDAO;

@Service
public class UserService {
	
	@Autowired
	public UserDAO userDAO;
	
	

}
