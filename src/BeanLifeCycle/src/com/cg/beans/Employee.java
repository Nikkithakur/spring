package com.cg.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean
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
@Override
public void destroy() throws Exception {
	System.out.println("Destoy");
	
}
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("Init");
	
}


	
}
