package com.sunil.RestapiD.day4.controller4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.RestapiD.day4.model4.Model4;
import com.sunil.RestapiD.day4.service4.UserService4;

@RestController
@RequestMapping("/api/v1/add")
public class Day4 {
	@Autowired
	UserService4 sser;
	@PostMapping("/add")
	public Model4 add(@RequestBody Model4 s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/show")
	public List<Model4> showinfo() {
		return sser.showinfo();
	}
	@PutMapping("/update")
	public Model4 changeinfo(@RequestBody Model4 s) {
		return sser.changeinfo(s);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		sser.delete(id);
	}
}
