package com.sunil.RestapiD.day7.controller7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.RestapiD.day7.model7.Car;
import com.sunil.RestapiD.day7.service7.ApiService;

@RestController
public class Day7 {
	@Autowired
	ApiService sser;
	@PostMapping("/")
	public Car add(@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/owners/{owners}")
	public Car add(@PathVariable int owners,@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/address/{address}")
	public Car add(@PathVariable String address,@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/carName/{carName}")
	public Car save(@PathVariable String carName,@RequestBody Car s) {
		return sser.saveinfo(s);
	}
	@GetMapping("/owners/{owners}/carType/{carType}")
	public Car showinfo(@PathVariable int owners,@PathVariable String carType,@RequestBody Car s) {
		return sser.saveinfo(s);
	}
}