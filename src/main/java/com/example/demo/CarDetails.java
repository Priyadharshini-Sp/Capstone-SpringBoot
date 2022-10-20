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
public class CarDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String CarId;
	
	private String CarName;
    private String Desc;
    private long Price;
    private String Location;
    private String Offers;
    private String Owner;
    
    
}
