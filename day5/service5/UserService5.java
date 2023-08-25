package com.sunil.RestapiD.day5.service5;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.sunil.RestapiD.day5.model5.Book5;
import com.sunil.RestapiD.day5.repository5.Repository5;
@Service
public class UserService5{ 
	@Autowired
	Repository5 sr;
	public Book5 saveinfo(Book5 s) {
		return sr.save(s);
	}
	public List<Book5> showinfo(){
		return sr.findAll();
	}
	public Book5 changeinfo(Book5 s) {
		return sr.saveAndFlush(s);
	}
	public void delete() {
		sr.deleteAll();
	}
	public void delete(@RequestBody int id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}
}
