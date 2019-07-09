package com.example.demo.entites;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity //create table user avec ses colonnes
@Table(name="users")

public class User implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String username;
	private String pass;
	private String email;
	
	
	@Temporal(TemporalType.DATE)		
	private  Date date;
	
	
	@OneToMany (mappedBy="user",fetch=FetchType.EAGER) // 3malna eager bech yforci al user w mayo93odech ya3mal boucle //slaver ya3ni one to many ywali one objet
	private List<Post> postList=new ArrayList<Post>();
	
	
	

	
	
	@Column(name="username")
	public String getUsername() {
		return username;
	}

	
	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="pass")
	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}

	@Column(name="email")
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="username")
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	@Column(name="date")
	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public List<Post> getPostList() {
		return postList;
	}


	public void setPostList(List<Post> postList) {
		this.postList = postList;
	}


	@Override
	public String toString() {
		return "User [username=" + username + ", pass=" + pass + ", email=" + email + ", id=" + id + ", date=" + date
				+ ", postList=" + postList + "]";
	}
	
	

	
	}
