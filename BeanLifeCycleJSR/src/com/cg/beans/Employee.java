package com.cg.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee

{
	private int emplNumber;
	String name;
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
	
	@PostConstruct
	public void init()
	{
		System.out.println("init");
	}
	
	@PreDestroy
	public void destroy()
	{
		System.out.println("destroyed");
	}
	
	
	
}
