package com.sunil.RestapiD.day1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.RestapiD.day1.Model.Address;
import com.sunil.RestapiD.day1.Model.Student;

@RestController
public class Day1 {
	
	@Value("${spring.properties.username}")
	public String name;
	
	@Value("${spring.properties.color}")
	public String color;
	
	@GetMapping("/welcome")
	public String Welcome()
	{
		return "Welcome String Boot!";
	}
	
	@GetMapping("/display")
	public String displayName()
	{
		return "Welcome "+name;
	}
	
	@GetMapping("/fav")
	public String displayColor()
	{
		return "My favorite color is "+color;
	}
	@GetMapping("/")
	public Student getDatas(){
		Student student=new Student();
		student.setStudentName("sunil");
		student.setMessage("Welcome to SpringBoot!");
		return  student;
	}
	@GetMapping("/address")
	public Address getDatas1(){
		Address address=new Address();
		address.setName("sunil");
		address.setDoorNo(9);
		address.setStreetName("East pillaiyar kovil street");
		address.setPincode(638460);
		address.setArea("Nambiyur");
		address.setDistrict("ERODE");
		address.setState("TAMIL NADU");
		address.setCountry("INDIA");
		return  address;
	}
}