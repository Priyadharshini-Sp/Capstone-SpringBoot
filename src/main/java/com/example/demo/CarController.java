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
public class CarController {
	@Autowired
	CarDAO dao;

	@PostMapping("/carRegister")
	public String Registeration(@RequestBody CarDetails cd) {
		
		 dao.insert(cd);
		 return "Added";
		
	}
	@GetMapping("/getAll")
	public List<CarDetails> findAllcars(){
     return dao.find();		
	}
	@DeleteMapping("/cancel/{id}")
	public List<CarDetails> cancelRegistration(@PathVariable String id){
		return dao.deleteById(id);
	
	}



}
