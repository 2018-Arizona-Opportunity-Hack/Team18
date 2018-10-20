package com.hackathon.services.business;

import java.util.List;
import com.hackathon.model.EmployeeModel;
import com.hackathon.model.SearchModel;

public interface IEmployeeService 
{
	public boolean addEmployee(EmployeeModel employee);
	public EmployeeModel getEmployee(String employeeID);
	public List<EmployeeModel> getEmployees();
	public List<EmployeeModel> searchEmployees(SearchModel search);
	public boolean updateEmployees(List<EmployeeModel> employees);
	public boolean deleteEmployee(String employeeID);
}
