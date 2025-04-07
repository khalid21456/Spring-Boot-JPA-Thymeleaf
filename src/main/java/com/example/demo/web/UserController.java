package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Models.Userr;
import com.example.demo.repositories.UserDAO;

@Controller
public class UserController {
	
	@Autowired
	public UserDAO userDAO;
	
	@GetMapping(path="/get")
	public String getUser(Model model) {
		List<Userr> list = userDAO.findAll();
		model.addAttribute("listOfUsers",list);
		return "user";
	}
	
	@GetMapping(path="/getJSON")
	public @ResponseBody List<Userr> getUsers() {
		return userDAO.findAll();
	}
	
	@PostMapping(path="/save")
	public String addUser(Model model, Userr user) {
		userDAO.save(user);
		return "redirect:/form";
	}
	
	@GetMapping(path="/form")
	public String form() {
		return "addUser";
	}

}
