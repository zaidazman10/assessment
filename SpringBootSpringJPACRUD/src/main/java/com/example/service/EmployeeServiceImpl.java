package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.model.Employee;
import com.example.repository.EmpolyeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmpolyeeRepository empolyeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return (List<Employee>) empolyeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		// TODO Auto-generated method stub
		return empolyeeRepository.findById(id).get();
	}

	@Override
	public void saveDrUpdate(Employee employee) {
		// TODO Auto-generated method stub
		empolyeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(long id) {
		// TODO Auto-generated method stub
		empolyeeRepository.deleteById(id);
		
	}

}
