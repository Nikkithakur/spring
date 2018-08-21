package com.cg.beans;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int emplNumber;
	private String name;
	@Autowired
	@Resource(name="address2")
	Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employee(int emplNumber) {
		super();
		this.emplNumber = emplNumber;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee(int emplNumber, String name) {
		super();
		this.emplNumber = emplNumber;
		this.name = name;
	}

	public int getEmplNumber() {
		return emplNumber;
	}

	public void setEmplNumber(int emplNumber) {
		this.emplNumber = emplNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee() {
		System.out.println("Employee object created");
	}

}
