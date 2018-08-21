package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.beans.JavaCollections;

public class MainAppl
{
 
	public static void main(String[] args)
	{
	
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		JavaCollections jc=(JavaCollections)context.getBean("javacollections");
		System.out.println(jc.getHashMap());
		System.out.println(jc.getList());
	}
	
	
	
	
}
