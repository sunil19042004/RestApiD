package com.sunil.RestapiD.day7.controller7;



import java.util.List;

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
	ApiService css;
	@PostMapping("/post")
	public Car save(@RequestBody Car data) {
		return css.save(data);
	}
	
	@GetMapping("/owner/{data}")
	public List<Car> getByOwn(@PathVariable int data){
		return css.getByOwn(data);
	}
	
	@GetMapping("/address/{address}")
	public List<Car> getByAddr(@PathVariable String address){
		return css.getByAddr(address);
	}
	@GetMapping("carname/{carname}")
	public List<Car> getByName(@PathVariable String carname){
		return css.getByName(carname);
	}
	@GetMapping("owners/{owners}/cartype/{cartype}")
	public List<Car> getByBoth(@PathVariable int owners, @PathVariable String cartype){
		return css.getBoth(owners, cartype);
	}
}