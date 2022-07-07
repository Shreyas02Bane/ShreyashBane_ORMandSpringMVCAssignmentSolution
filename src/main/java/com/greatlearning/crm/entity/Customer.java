package com.greatlearning.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String email;
	
	
	public Customer() {
	}


	public Customer(String fName, String lName, String email) {
		this.firstName = fName;
		this.email = email;
		this.lastName = lName;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return firstName;
	}


	public void setName(String name) {
		this.firstName = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return lastName;
	}


	public void setAddress(String address) {
		this.lastName = address;
	}
	
	

}
