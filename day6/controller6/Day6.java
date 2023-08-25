//package com.skcet.day1.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.skcet.day1.model.UserModel;
//import com.skcet.day1.service.UserService;
//
//@RestController
//@RequestMapping("/api/v1/user")
//public class UserController {
//	
//	@Autowired
//	private UserService userService;
//	
//	@GetMapping("/getUser")
//	public ResponseEntity<UserModel> getUser(@RequestBody UserModel user){
//		return ResponseEntity.status(200).body(user);
//	}
//	@GetMapping("/getQuery")
//	public ResponseEntity<UserModel> getQuery(@RequestBody UserModel user){
//		return ResponseEntity.status(200).body(user);
//	}
//	@GetMapping("/getEmail")
//	public ResponseEntity<UserModel> getEmail(@PathVariable String email){
//		return ResponseEntity.status(200).body(userService.getEmail(email));
//	}
//	
//	@GetMapping("/getAllUser")
//    public ResponseEntity<Page<UserModel>> getAllUser(
//		@RequestParam(defaultValue = "0")int page,
//		@RequestParam(defaultValue = "10") int size,
//		@RequestParam(defaultValue = "id") String sortField,
//		@RequestParam(defaultValue = "asc") String sortOrder
//	){
//		PageRequest pageRequest=PageRequest.of(page, size, Sort.by(Sort.Direction.fromString(sortOrder), sortField));
//		return ResponseEntity.status(200).body(userService.getAllUser(pageRequest));
//	}
//	
//	public ResponseEntity<UserModel> getFullName(@RequestBody UserModel user){
//		return ResponseEntity.status(200).body(user);
//	}
//	@PostMapping("/addUser")
//	public ResponseEntity<String> addUser(@RequestBody UserModel user){
//	boolean dataSaved =userService.addUser(user);
//	if(dataSaved)
//	{
//		return ResponseEntity.status(200).body("User added successfully");
//	}
//	else {
//		return ResponseEntity.status(404).body("Something went wrong!");
//	}
//	}
//	
//	@PutMapping("/updateUser/{id}")
//	//@RequestParam
//	public ResponseEntity<String>updateUser(@PathVariable int id,@RequestBody UserModel user){
//		boolean userData=userService.updateUser(id,user);
//		if(userData) {
//			return ResponseEntity.status(200).body("User updateed succesfully");
//			
//		}else {
//			return ResponseEntity.status(404).body("no record");
//		}
//	}
//	@DeleteMapping("/deleteUser/{id}")
//	public ResponseEntity<String>deleteUser(@PathVariable int id){
//		boolean userDeleted=userService.deleteUser(id);
//		if(userDeleted) {
//			return ResponseEntity.status(200).body("User Deleted succesfully");
//		}else {
//			return ResponseEntity.status(200).body("no record");
//		}
//		
//	}
//}
//
package com.sunil.RestapiD.day6.controller6;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sunil.RestapiD.day6.model6.Child;
import com.sunil.RestapiD.day6.service6.Service6;
@RestController
public class Day6 {
	@Autowired
	public Service6 tserv;
	
	//posting the data
	@PostMapping("/insertingDetails")
	public String insertingDetails(@RequestBody Child t)
	{
		 tserv.postData(t);
		 return "Your data is saved successfully";
	}
	@GetMapping("/gettingDetails")
	public List<Child> gettingData(){
		return tserv.getData();
	}
	//get all row
	@GetMapping("/getAllrows")
	public List<Child> getAllRows()
	{
		return tserv.getAllRows();
	}
	//get data
	@GetMapping("/getSpecrows/{addr}/{FirstName}")
	public List<Child> getSpecrows(@PathVariable("addr") String addr,@PathVariable ("FirstName") String FirstName)
	{
		return tserv.getSpecrows(addr, FirstName);
	}
	//get data by char
	@GetMapping("/getByName/{char}")
	public List<Child> getByName(@PathVariable("char") String FirstName)
	{
		return tserv.getDataByChar(FirstName);
	}
	//delete data
	@DeleteMapping("/deleteRow/{id}")
	public String deleteRow(@PathVariable("id") int id)
	{
		return tserv.deleteById(id)+" deleted";
	}
	//update the data
	@PutMapping("updateData/{address}/{id}")
	public String updateData(@PathVariable("address") String addr,@PathVariable("id") int id)
	{
		return tserv.updateData(addr, id)+" data is updated";
	}

}