package com.example.demo.reposity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entites.User;


@Repository("UserReposity")

public interface UserReposity extends JpaRepository<User, Integer>{
	//e=user ili nhotou fiha donne mta3na
	@Query(value="SELECT e FROM User e WHERE e.pass = :password and e.username=:name")
	User findByUsers(@Param("password") String password ,@Param("name") String name);
	
	

}
