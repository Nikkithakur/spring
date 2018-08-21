package com.cg.main;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.beans.Employee;

public class MainAppl
{
 
	public static void main(String[] args)
	{
	
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		context.registerShutdownHook();
		Employee emp=(Employee)context.getBean("employee");
		System.out.println(emp);
		
	}
	
	
	
	
}
