package my.services;

import java.util.List;

import my.beans.EmployeeEntity;

public interface LoginService {
	void insertEmployee(EmployeeEntity s);
	List<EmployeeEntity> displayEmployee();
	public EmployeeEntity getEmployee(int id);
}
