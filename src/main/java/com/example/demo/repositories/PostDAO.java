package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Post;
import com.example.demo.Models.Userr;

import java.util.List;


@Repository
public interface PostDAO extends JpaRepository<Post, Long>{
	
	public List<Post> findByUser(Userr user);
	
}
