package com.sunil.RestapiD.day3.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sunil.RestapiD.day3.model.UserModel;

public interface Repository extends JpaRepository<UserModel,Integer> {

	boolean existsById(int id);
}

