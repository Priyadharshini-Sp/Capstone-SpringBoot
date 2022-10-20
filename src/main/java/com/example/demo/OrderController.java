package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class OrderController {
	@Autowired
	OrderDAO dao;
	@PostMapping("/order")
	public String Registeration(@RequestBody Orders od) {
		
		 dao.insert(od);
		 return "Added";
		
	}
	@GetMapping("/getAllorders")
	public List<Orders> findAllcars(){
     return dao.listoforders()	;	
	}
    
}
