package com.sunil.RestapiD.day7.repository7;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunil.RestapiD.day7.model7.Car;
@org.springframework.stereotype.Repository
public interface CarRepo extends JpaRepository<Car, Integer>{


}

