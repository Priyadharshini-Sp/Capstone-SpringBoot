package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRRepo extends JpaRepository<AdminR, String>{

	

	AdminR findByadminname(String adminname);

	AdminR findByadminpassword(String adminpassword);

}
