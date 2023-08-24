package com.sunil.RestapiD.day5.repository5;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunil.RestapiD.day5.model5.Book5;
@Repository
public interface Repository5 extends JpaRepository<Book5,Integer>{

}