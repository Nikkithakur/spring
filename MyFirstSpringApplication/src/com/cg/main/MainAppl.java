package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.beans.Employee;

public class MainAppl
{
 
	public static void main(String[] args)
	{
	
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Employee emp=(Employee)context.getBean("employee");
		System.out.println(emp.getName());
		Employee emp1=(Employee)context.getBean("employee");
		System.out.println(emp1.getName());
	}
	
	
	
	
}
