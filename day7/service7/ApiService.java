package com.sunil.RestapiD.day7.service7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.RestapiD.day7.model7.Car;
import com.sunil.RestapiD.day7.repository7.CarRepo;

@Service
public class ApiService {
	@Autowired
	CarRepo crep;
	
	public Car save(Car data) {
		return crep.save(data);
	}
	
	public List<Car> getByOwn(int own){
		return crep.getCarInFromOwners(own);
	}
	public List<Car> getByAddr(String addr){
		return crep.getCarInFromAddress(addr);
	}
	public List<Car> getByName(String name){
		return crep.getCarFromName(name);
	}
	public List<Car> getBoth(int own, String type){
		return crep.getCarInFromOwnNCt(own, type);
	}
}