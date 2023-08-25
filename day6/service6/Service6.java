package com.sunil.RestapiD.day6.service6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.RestapiD.day6.model6.Child;
import com.sunil.RestapiD.day6.repository6.ChildRepo;


@Service
public class Service6 {
	@Autowired
	public ChildRepo trepo;
	
	//post data
	public String postData(Child t)
	{
		trepo.save(t);
		return "Your data is saved successfully";
	}
	//getdata
	public List<Child> getData()
	{
		return trepo.findAll();
	}

	//get all data
	public List<Child> getAllRows()
	{
		return trepo.getAllRows();
	}
	//get Spec data
	public List<Child> getSpecrows(String addr,String name)
	{
		return trepo.getSpecRows(addr, name);
	}
	//get by Char
	public List<Child> getDataByChar(String name)
	{
		return trepo.getByname(name);
	}
	//delete the data
	public int deleteById(int id)
	{
		return trepo.deleteId(id);
	}
	//update the data 
	public int updateData(String addr,int no_id) {
		return trepo.updateById(addr,no_id);
	}
	
	
} 