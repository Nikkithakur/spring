package com.cg.beans;



public class Employee {
	private int emplNumber;
	private String name;
	

	

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

	public void init()
	{
		System.out.println("Going though init");
	}
	
	public void destroy()
	{
		System.out.println("After destroyed");
	}

	@Override
	public String toString() {
		return "Employee [emplNumber=" + emplNumber + ", name=" + name + "]";
	}
	
	
	
}
