package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormDAO {
@Autowired
FormRepo repo;
public Form Registration(Form f) {
	return repo.save(f);
}
public List<Form> find() {
	// TODO Auto-generated method stub
	return repo.findAll();
}
}
