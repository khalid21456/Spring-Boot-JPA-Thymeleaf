package com.example.demo.Models;


import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "Post")
public class Post {
	
	public Post() {}
	
	public Post(Long id, String content, Date dataPub, Userr user) {
		super();
		this.id = id;
		this.content = content;
		this.dataPub = dataPub;
		this.user = user;
	}

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	
	public String content;
	
	public Date dataPub;
	
	
	@ManyToOne
	@JoinColumn(name="user")
	public Userr user;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public Date getDataPub() {
		return dataPub;
	}


	public void setDataPub(Date dataPub) {
		this.dataPub = dataPub;
	}


	public Userr getUser() {
		return user;
	}


	public void setUser(Userr user) {
		this.user = user;
	}
	
	
}
