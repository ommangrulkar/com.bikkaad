package com.bikkadIt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bikkadIt.model.UserEntity;
import com.bikkadIt.servise.UserserviseI;

@RestController
public class Usercontroller {

	@Autowired
	private UserserviseI userserviseI;
	
	@PostMapping("/saveUserEntity")
	public UserEntity saveUserEntity(@RequestBody UserEntity userEntity) {
		UserEntity user = userserviseI.saveuserEntity(userEntity);
		
		return user;
	}
	@GetMapping("/getAll")
	public List<UserEntity> getAll() {
		List<UserEntity> list = userserviseI.getAllUser();
		return list;
	}
	@GetMapping("/getSingleUser/{id}")
	public UserEntity getAlluser(@PathVariable int id) {
		
		UserEntity singleUser = userserviseI.getSingleUser(2);
		return singleUser;
	}
	
	
	@PutMapping("/update")
	public UserEntity updateUserEntity(@RequestBody UserEntity userEntity) {
		
		UserEntity updateUser = userserviseI.updateUser(userEntity);
		
		return updateUser;
	}
	@DeleteMapping("/deleteSingleUser/{id}")
	public List<UserEntity> deleteUserEntity(@PathVariable int id) {
		List<UserEntity> deleteSingleUser = userserviseI.deleteSingleUser(id);
		return deleteSingleUser;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllUser() {
		userserviseI.deleteAllUser();
		return "All data deleted";
	}
	
	public List<UserEntity> saveAll(@RequestBody List<UserEntity> userEntity){
		
		List<UserEntity> saveAll = userserviseI.saveAll(userEntity);
		return saveAll;
		
		
	}
}






















