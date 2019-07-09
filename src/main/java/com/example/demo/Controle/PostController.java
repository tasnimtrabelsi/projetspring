package com.example.demo.Controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Post;
import com.example.demo.entites.User;

import com.example.demo.services.PostServices;
import com.example.demo.services.UserService;

@RestController // notation bech yefhem ili houwa conroller
@RequestMapping(value="/post")
public class PostController {
	
	@Autowired // injection
	PostServices postService;
	
	@Autowired
	UserService userservice;
	
	@RequestMapping(value="/add/{userid}",method=RequestMethod.POST)
	public void ajoutPost(@RequestBody Post post,@PathVariable("userid")int id)
	{
		
	
		
		User u= userservice.getOne(id); // nsta3mlouha f slave master
		u.getPostList().add(post); // nzid post f user 
		post.setUser(u);// slave master	
		//userservice.seveEntityManagerUser(u);
		postService.add(post);
	}

}

