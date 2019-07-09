package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entites.Post;
import com.example.demo.reposity.PostRepositry;

@Service
public class PostServicesImpl implements PostServices{
	
	@Autowired // injection
	PostRepositry postRepositry; 

	@Override //re utilisation de function
	public void add(Post post) {
		postRepositry.save(post);
		
	}

	@Override
	public List<Post> getAll() {
		return postRepositry.findAll();
	}

}
