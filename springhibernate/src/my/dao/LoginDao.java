package my.dao;

import java.util.List;

import my.beans.EmployeeEntity;

public interface LoginDao {
	public boolean myInsert(EmployeeEntity employeeEntity);

	public List<EmployeeEntity> giveEmployee();
	
	public EmployeeEntity getEmployee(int id);
}
