package com.emp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	@Id
	private String id;
	private String FirstName;
	private String SecoundName;
	private String address;
	private Float salary;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee( String firstName, String secoundName, String address, Float salary) {
		super();

		FirstName = firstName;
		SecoundName = secoundName;
		this.address = address;
		this.salary = salary;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getSecoundName() {
		return SecoundName;
	}


	public void setSecoundName(String secoundName) {
		SecoundName = secoundName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public Float getSalary() {
		return salary;
	}


	public void setSalary(Float salary) {
		this.salary = salary;
	}
	

	
}