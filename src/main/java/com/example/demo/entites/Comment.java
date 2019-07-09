package com.example.demo.entites;

import java.io.Serializable;

import javax.persistence.*;


@Entity
@Table(name="comment")
public class Comment implements Serializable {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
	 private String text;
	 
	 @ManyToOne
		private Post post ;
	 
	 @ManyToOne
		private User user ;
	 
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Column(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name="text")
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	


	
}