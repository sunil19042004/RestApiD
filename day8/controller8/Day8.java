package com.sunil.RestapiD.day8.controller8;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.RestapiD.day8.model8.Bike;
import com.sunil.RestapiD.day8.service8.Service8;

@RestController
public class Day8 {
	@Autowired
	Service8 bser;
	@PostMapping("/bike")
	public Bike save(@RequestBody Bike s) {
		return bser.add(s);
	}
	@GetMapping("/year/{year}")
	public List<Bike> showByYear(@PathVariable int year) {
		return bser.getByYear(year);
	}
	@GetMapping("/year/name/{year}/{name}")
	public List<Bike> getYearandName(@PathVariable int year,@PathVariable String name){
		return bser.getByYearAndName(year, name);
	}
	@GetMapping("/name/{name}")
	public List<Bike> getbyname(@PathVariable String name){
		return bser.getByName(name);
	}
}