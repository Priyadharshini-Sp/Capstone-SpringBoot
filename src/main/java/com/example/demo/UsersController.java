package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class UsersController {
	@Autowired
	UsersDAO dao;
	@Autowired
	UsersRepo repo;
	@PostMapping("/usersRegister")
	public String insert(@RequestBody Users u) {
		dao.Registration(u);
		return "Registerd";
	}
	@PostMapping("/usersLogin")
	public String UserLogin(@RequestBody Users u)
	{
			return dao.UserLogin(u.getUsername(),u.getPassword());
	}
	@GetMapping("/getAllusers")
	public List<Users> findAllcars(){
     return dao.find();		
	}
	@DeleteMapping("/delete/{id}")
	public List<Users> cancelRegistration(@PathVariable String id){
		return dao.deleteById(id);
	
	}
	}



