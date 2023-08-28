package com.sunil.RestapiD.day7.service7;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunil.RestapiD.day7.model7.Car;
import com.sunil.RestapiD.day7.repository7.CarRepo;

@Service
public class ApiService{ 
	@Autowired
	CarRepo sr;
	public Car saveinfo(Car s) {
		return sr.save(s);
	}
	public List<Car> showinfo(int owners) {
		// TODO Auto-generated method stub
		return sr.findAll();
	}
}