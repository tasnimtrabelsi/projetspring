package com.example.demo.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entites.User;
import com.example.demo.reposity.UserReposity;

@Service("userservice") //userservice fih les methodes elii bech injectiwah fel cotroller
public  class UserServiceImpl  implements UserService{
	@Autowired
	UserReposity userrepository;
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<User> getAll(){
	
	
	return userrepository.findAll();
	
	
	
	
	}

	@Override
	public User getOne(int id) {
	
		return userrepository.getOne(id);
	}
@Override
	public void saveUser(User user) { // web service
		userrepository.save(user) ;//les methodes de jpa reposity

}


@Transactional
@Override
public void seveEntityManagerUser(User user) {
	em.persist(user);//persisit=save
	
}

@Override
public void DeleteUser(User user) {
	userrepository.delete(user);
	
}

@Override
public User getById(Integer id) {
	return userrepository.getOne(id);
	
}
}