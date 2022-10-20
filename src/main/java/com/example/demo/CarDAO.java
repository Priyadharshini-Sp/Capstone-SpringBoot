package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarDAO {
	@Autowired 
	CarRepo repo;
	
	public CarDetails insert(CarDetails c) {
		return repo.save(c);
	}

	public List<CarDetails> find() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public List<CarDetails>  deleteById(String id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return repo.findAll();
	}

	
}
