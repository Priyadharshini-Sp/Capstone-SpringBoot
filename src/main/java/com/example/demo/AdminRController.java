package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@CrossOrigin("*")
public class AdminRController {
	@Autowired
	AdminRDAO dao;

	@PostMapping("/adminRRegister")
	public String Registeration(@RequestBody AdminR a) {
		
		 dao.Registration(a);
		 return "Successfully Registered";
		
	}
	@PostMapping("/adminRLogin")
	public String adminsLogin(@RequestBody AdminR u)
	{
			return dao.AdminRLogin(u.getAdminname(),u.getAdminpassword());
	}
}
