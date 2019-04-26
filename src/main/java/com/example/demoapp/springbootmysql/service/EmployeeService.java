package com.example.demoapp.springbootmysql.service;

import java.util.List;

import com.example.demoapp.springbootmysql.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}
