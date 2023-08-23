package com.sunil.RestapiD.day4.controller4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.RestapiD.day3.service.UserService;
import com.sunil.RestapiD.day4.model4.Model4;


@RestController
@RequestMapping("/api/v1/add")
public class Day4 {
	@Autowired
	UserService sser;
	@PostMapping("/add")
	public ResponseEntity<Model4>addUser(@RequestBody Model4 user) {
	return ResponseEntity.status(200).body(user);
	}
	@GetMapping("/show")
	public ResponseEntity<Model4>getUser(@RequestBody Model4 user) {
		return ResponseEntity.status(200).body(user);
	}
	@PutMapping("/update")
	public ResponseEntity<Model4>putUser(@RequestBody Model4 user) {
		return ResponseEntity.status(200).body(user);
	}
	@DeleteMapping("/delete")
		public ResponseEntity<Model4>deleteUser(@RequestBody Model4 user) {
			return ResponseEntity.status(200).body(user);
	}
}