package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersDAO {
	@Autowired
	UsersRepo repo;
	public Users Registration(Users u) {
		return repo.save(u);
	}
	public String UserLogin(String username,String password) {
		Users ul=repo.findByusername(username);
		Users pwd=repo.findBypassword(password);
		if(ul!=null&&pwd!=null) {
		
		if(ul.getUsername().equals(username)&&ul.getPassword().equals(password)) {
			return "Logged in";
		}
		
		else
		{
			return "Invalid Credentials";
		}
		}
		return "useremail and password must be value";
	}
	public List<Users> find() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	public List<Users>  deleteById(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return repo.findAll();
	}

}
