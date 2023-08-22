package com.sunil.RestapiD.day3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.RestapiD.day3.model.UserModel;
import com.sunil.RestapiD.day3.service.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class Day3 {
	
	@Autowired
	private UserService userService;
	
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
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<String>updateUser(@RequestParam int id,@RequestBody UserModel user){
		boolean userData=userService.updateUser(id,user);
		if(userData) {
			return ResponseEntity.status(200).body("User updateed succesfully");
			
		}else {
			return ResponseEntity.status(404).body("no record");
		}
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String>deleteUser(@PathVariable int id){
		boolean userDeleted=userService.deleteUser(id);
		if(userDeleted) {
			return ResponseEntity.status(200).body("User Deleted succesfully");
		}else {
			return ResponseEntity.status(200).body("no record");
		}
		
	}
}

