package com.sunil.RestapiD.day3.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunil.RestapiD.day3.model.UserModel;
import com.sunil.RestapiD.day3.repository.Repository;


import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private Repository userRepository;
	
	@Override
	public boolean addUser(UserModel user) {
		
		boolean userExists=userRepository.existsById(user.getId());
		if(!userExists) {
			userRepository.save(user);
			return true;
		}else {
			return false;
		}
	}
@Override
public List<UserModel>getUser(){
	return userRepository.findAll();
}
	@Override
	public boolean updateUse(UserModel user) {
		// TODO Auto-generated method stub
		return false;
	}
}