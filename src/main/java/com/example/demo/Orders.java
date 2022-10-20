package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;
	
	private String CarName;
    private long Price;
    
}
