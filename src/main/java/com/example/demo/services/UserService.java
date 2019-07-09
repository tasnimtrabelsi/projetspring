package com.example.demo.services;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entites.User;

public interface UserService {
	public List<User> getAll();
	public User getOne(int id );
	public void saveUser(User user);
	public void seveEntityManagerUser(User user);
	public void DeleteUser(User user);
	
	public User getById(Integer id);
}
