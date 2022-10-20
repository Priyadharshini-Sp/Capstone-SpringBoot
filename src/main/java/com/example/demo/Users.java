package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Users {
	 @Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	 private String userid;
	
	 private String username;
	 private String password;
	 private String email;
	 private String location;
	 private String contact;
}
