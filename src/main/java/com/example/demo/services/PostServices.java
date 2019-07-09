package com.example.demo.services;

import java.util.List;


import com.example.demo.entites.Post;

public interface PostServices {

	public void add(Post post);
	public List<Post> getAll();
}
