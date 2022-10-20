package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
	@Autowired
	UserRepo repo;
	public User Registration(User u) {
		return repo.save(u);
	}
	

}
