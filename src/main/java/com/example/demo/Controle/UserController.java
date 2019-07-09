package com.example.demo.Controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.User;
import com.example.demo.reposity.UserReposity;
import com.example.demo.services.UserService;
@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserController {
	static class Formlogin{
		  String username;
		  String password;
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		 
	}
	
	@Autowired  //instance luserrepository
	UserReposity userReposity; //injection
	
	@Autowired
	UserService userservice;
	

	// ou hedhi @PostMapping(value="/user",method=RequestMethod.POST)
	
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public void saveUser(@RequestBody User user) { // web service
		userservice.saveUser(user) ;//les methodes de jpa reposity

}
//	@RequestMapping(value="/all", method = RequestMethod.GET)
//	public List<User> getAll(){
		
//		return userReposity.findAll();
//	}
	@RequestMapping(value="/all", method = RequestMethod.GET) // hedhi m3aha fard 5edma @GetMapping("/finduserr")
	public List<User> getAll(){
		return userservice.getAll();
	}
	@RequestMapping (value="/login",method = RequestMethod.POST)
	public   @ResponseBody User login ( @RequestBody Formlogin user) {
System.out.println(user.password +user.username);
	return userReposity.findByUsers(user.password ,user.username);
	}		
@RequestMapping(value="/delete/{id}", method =RequestMethod.DELETE)	
		public void deleteUser (@PathVariable("id")Integer id) {
	User u = userservice.getById(id);
	userservice.DeleteUser(u);
}
	
	}
