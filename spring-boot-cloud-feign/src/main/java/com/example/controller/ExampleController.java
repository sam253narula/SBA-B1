package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.PostClient;
import com.example.client.TodoClient;
import com.example.client.UserClient;
import com.example.postmodel.PostResponse;
import com.example.todomodel.TodoResponse;
import com.example.usermodel.UserResponse;

@RestController
public class ExampleController {

	@Autowired
	private UserClient userClient;

	@Autowired
	private PostClient postClient;
	
	@Autowired
	private TodoClient todoClient; 
	
	@GetMapping("/getAllUsers")
	public List<UserResponse> getAllUsers() {
		return userClient.getAllUsers();
	}

	@GetMapping("/getAllPost")
	public List<PostResponse> getAllPost() {
		return postClient.getAllPost();
	}
	
	@PostMapping("/insertPost")
	public Object insertPost(PostResponse postResponse) {
		return postClient.insertPost(postResponse);
	}
	
	@GetMapping("/getTodos")
	public List<TodoResponse> getTodos() {
		return todoClient.getTodos();
	}
	
}
