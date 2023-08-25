package com.sunil.RestapiD.day5.controller5;


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

import com.sunil.RestapiD.day5.model5.Book5;
import com.sunil.RestapiD.day5.service5.UserService5;


@RestController
@RequestMapping("/api/v1/user")
public class Day5 {
	@Autowired
	UserService5 user;
	@PostMapping("/add")
	public Book5 add(@RequestBody Book5 s) {
		return user.saveinfo(s);
	}
	@GetMapping("/show")
	public ResponseEntity<Book5> getUser(@RequestBody Book5 s) {
		return ResponseEntity.status(200).body(s);
	}
	@PutMapping("/update/{id}")
	public Book5 changeinfo(@PathVariable int id,@RequestBody Book5 s) {
		return user.changeinfo(s);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		user.delete(id);
	}
}
