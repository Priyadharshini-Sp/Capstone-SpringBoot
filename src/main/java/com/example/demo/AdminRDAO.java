package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminRDAO {
	@Autowired
	AdminRRepo repo;
	
	public AdminR Registration(AdminR a) {
		return repo.save(a);
	}
	public String AdminRLogin(String adminname,String adminpassword) {
		AdminR ul=repo.findByadminname(adminname);
		AdminR pwd=repo.findByadminpassword(adminpassword);
		if(ul!=null&&pwd!=null) {
		
		if(ul.getAdminname().equals(adminname)&&ul.getAdminpassword().equals(adminpassword)) {
			return "Logged in";
		}
		
		else
		{
			return "Invalid Credentials";
		}
		}
		return "useremail and password must be value";
	}

}
