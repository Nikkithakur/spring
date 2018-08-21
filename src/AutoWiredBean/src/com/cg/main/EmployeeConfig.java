package com.cg.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cg.beans.Address;
import com.cg.beans.Employee;

@Configuration
public class EmployeeConfig 

{
	@Bean
	public Employee employee()
	{
		return new Employee();
	}
	
	@Bean
	public Address address()
	{
		return new Address();
	}
	
	
}
