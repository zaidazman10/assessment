package com.example.service;

import java.util.List;

import com.example.model.*;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(long id);
	
	public void saveDrUpdate(Employee employee);
	
	public void deleteEmployee(long registrationNumber);

}
