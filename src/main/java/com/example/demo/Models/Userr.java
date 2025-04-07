package com.example.demo.Models;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "app_user")

public class Userr {
	
	public Userr() {}
	
	public Userr(Long id, String name, String lname, String adress, String tel, List<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.adress = adress;
		this.tel = tel;
		this.posts = posts;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String name;
	public String lname;
	public String adress;
	public String tel;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public List<Post> getProducts() {
		return posts;
	}

	public void setProducts(List<Post> products) {
		this.posts = products;
	}
	
}
