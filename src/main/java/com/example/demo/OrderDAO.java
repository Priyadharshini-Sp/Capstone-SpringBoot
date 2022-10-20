package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDAO {
	@Autowired
	OrderRepo repo;
	public Orders insert(Orders o) {
		return repo.save(o);
		// TODO Auto-generated method stub
		
		
	}
	public List<Orders> listoforders(){
		return repo.findAll();
	}
	
}
