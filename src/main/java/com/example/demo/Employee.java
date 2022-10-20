package com.example.demo;

import java.io.Serializable;

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
public class Employee implements Serializable {
	 
		@GeneratedValue(strategy = GenerationType. AUTO)
		 private int empid;
		@Id
		 private String empname;
		@Id
		 private String emppassword;
		 private String empemail;
		 
}
