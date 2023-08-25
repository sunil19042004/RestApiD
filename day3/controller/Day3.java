package com.sunil.RestapiD.day3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.RestapiD.day3.model.UserModel;
import com.sunil.RestapiD.day3.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class Day3 {
	@Autowired
	private UserService userService;
	@GetMapping("/getUser")
	public ResponseEntity<UserModel> getUser(@RequestBody UserModel user){
		return ResponseEntity.status(200).body(user);
	}
	@PostMapping("/addUser")
	public ResponseEntity<String> addUser(@RequestBody UserModel user){
	boolean dataSaved =userService.addUser(user);
	if(dataSaved)
	{
		return ResponseEntity.status(200).body("User added successfully");
	}
	else {
		return ResponseEntity.status(404).body("Something went wrong!");
	}
	}
}