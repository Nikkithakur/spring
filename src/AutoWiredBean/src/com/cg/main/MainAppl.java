package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.beans.Employee;

public class MainAppl
{
 
	public static void main(String[] args)
	{
	
		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
		Employee emp=(Employee)context.getBean("employee");
		
		
	}
	
	
	
	
}
