package com.sunil.RestapiD.day8.service8;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.RestapiD.day8.model8.Bike;
import com.sunil.RestapiD.day8.repository8.BikeRepo;

@Service
public class Service8 {
	@Autowired
	BikeRepo br;
	public Bike add(Bike s) {
		return br.save(s);
	}
	public List<Bike> getByYear(int year){
		return br.getByYear(year);
	}
	public List<Bike> getByYearAndName(int year,String name){
		return br.getByYearAndName(year, name);
	}
	public List<Bike> getByName(String name){
		return br.getByName(name);
	}
}