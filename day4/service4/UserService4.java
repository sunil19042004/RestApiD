package com.sunil.RestapiD.day4.service4;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunil.RestapiD.day4.model4.Model4;
import com.sunil.RestapiD.day4.repository4.Repository4;
@Service
public class UserService4 {
	@Autowired
	Repository4 sr;
	public Model4 saveinfo(Model4 s) {
		return sr.save(s);
	}
	public List<Model4> showinfo(){
		return sr.findAll();
	}
	public Model4 changeinfo(Model4 s) {
		return sr.saveAndFlush(s);
	}
	public void delete() {
		sr.deleteAll();
	}
}