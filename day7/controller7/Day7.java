package com.sunil.RestapiD.day7.controller7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sunil.RestapiD.day7.model7.Car;
import com.sunil.RestapiD.day7.service7.ApiService;

@RestController
@RequestMapping("/")
public class Day7 {
	@Autowired
	ApiService sser;
	@PostMapping("adds")
	public Car add(@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("shows")
	public List<Car> showinfo() {
		return sser.showinfo();
	}
}