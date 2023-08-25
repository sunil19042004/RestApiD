package com.sunil.RestapiD.day3.service;

import java.util.List;

import com.sunil.RestapiD.day3.model.UserModel;

public interface UserService {
    public boolean addUser(UserModel user);
    
    public boolean updateUse(UserModel user);
	List<UserModel> getUser();

}
 