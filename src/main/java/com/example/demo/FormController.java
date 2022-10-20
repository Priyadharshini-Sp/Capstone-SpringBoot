package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {
@Autowired
FormDAO dao;
	
	@PostMapping("/form")
	public String Registeration(@RequestBody Form a) {
		
		 dao.Registration(a);
		 return "Added";
		
	}
	@GetMapping("/getAllfroms")
	public List<Form> findAllcars(){
     return dao.find();		
	}

}
