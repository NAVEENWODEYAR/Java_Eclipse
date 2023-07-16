package com.oignon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.oignon.dto.ResponseDTO;
import com.oignon.modal.User;
import com.oignon.service.UserService;

import io.swagger.models.Response;

@RestController
public class UserController
{
	// DI
	@Autowired
	UserService userService;
	
	// REST API's
	// 1. post for sending the data.,
	@PostMapping("/insertUser")
	public ResponseEntity<ResponseDTO> insertUser(@RequestBody User user)
	{
		User user1 = userService.insertUser(user);
		ResponseDTO rDTO = new ResponseDTO("New user registered successfully", user1);
		return new ResponseEntity<>(rDTO, HttpStatus.CREATED);
	}
	
	// 2. receiving the data.,
	@GetMapping("/getUsers")
	public ResponseEntity<ResponseDTO> getUsers()
	{
		List<User> user = userService.getUsers();
		ResponseDTO rDTO = new ResponseDTO("Users retrived successfully", user);
		return new ResponseEntity<>(rDTO,HttpStatus.FOUND);
	}
	
	// 3. updating the data
	@PutMapping("/updateUser/{uId}")
	public ResponseEntity<ResponseDTO> updateUser(@PathVariable Integer uId, @RequestBody User user )
	{
		User user1 = userService.updateUser(uId, user);
		ResponseDTO rDTO = new ResponseDTO("User details updated.,",user1);
		return new ResponseEntity<ResponseDTO>(rDTO, HttpStatus.OK);
	}
	
	// 4. delete the data
	@DeleteMapping("/deleteUser/{uId}")
	public ResponseEntity<ResponseDTO> deleteUser(@PathVariable Integer uId)
	{
		String s = userService.deleteUser(uId);
		ResponseDTO rDTO = new ResponseDTO("User deleted successfully", s);
		return new ResponseEntity<>(rDTO, HttpStatus.GONE);
	}

}
