package com.oignon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.oignon.dto.ResponseDTO;
import com.oignon.dto.UserDTO;
import com.oignon.modal.User;
import com.oignon.repo.UserRepo;
import com.oignon.utility.MailService;

@Service
public class UserService 
{
	// DI.,
	@Autowired
	UserRepo userRepo;
	
	@Autowired
	MailService mailService;
	
		// CRUD operations.,
		// 1. insert into user 
		public User insertUser(User user)
		{
			User user1 = userRepo.save(user);
				mailService.sendMail(user1.getuMail(), "Welcome to the club.,", "New user registration.,");
				return user1;
		}
		
		// 2. select * from user
		public List<User> getUsers()
		{
			return userRepo.findAll();
		}
		
		// 3. update the user
		public User updateUser(Integer uId, User user)
		{
			User user1 = userRepo.findById(uId).get();
				user1.setuName(user.getuName());
				user1.setuMail(user.getuMail());
				user1.setuSal(user.getuSal());
				user1.setDate(user.getDate());
				
				return userRepo.save(user1);
		}
		
		// 4. delete the data.,
		public String deleteUser(Integer uId)
		{
			userRepo.deleteById(uId);
			return "";
		}
}
