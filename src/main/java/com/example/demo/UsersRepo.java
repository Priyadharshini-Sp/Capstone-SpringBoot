package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepository<Users, String>{

	Users findByusername(String username);

	Users findBypassword(String password);

}
