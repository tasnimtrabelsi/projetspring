package com.example.demo.reposity;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entites.Post;

public interface PostRepositry extends JpaRepository<Post, Integer> {

}
