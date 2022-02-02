package com.spring.project.vehiclelicence.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.vehiclelicence.entity.Document;
import com.spring.project.vehiclelicence.entity.User;
import com.spring.project.vehiclelicence.repo.UserRepository;
@Service
public class UserService {
	@Autowired
	UserRepository userRepository;

	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	public boolean deleteAllUser() {
		try{
			userRepository.deleteAll();
		}catch(Exception e){
			return false;
		}
		return true;
	}

	public User updateUser(int userId, User obj) {
		Optional<User>addContainer=userRepository.findById(userId);
		if(addContainer.isPresent())
		{
			User oldObj= addContainer.get();
			oldObj.setEmail(obj.getEmail());
			oldObj.setPassword(obj.getPassword());
			System.out.println("successfully updated");
			return userRepository.saveAndFlush(oldObj);
		}
		
		System.out.println("no object found with these id");
		return obj;
	}

}
