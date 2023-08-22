package com.sunil.RestapiD.day2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2 {
   @Value("${vil}")
   public String name;
   @GetMapping("/namereturn")
   public String display() {
	   return name;
   }
}
