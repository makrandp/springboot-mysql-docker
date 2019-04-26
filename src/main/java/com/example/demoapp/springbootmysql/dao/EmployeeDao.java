package com.example.demoapp.springbootmysql.dao;

import java.util.List;

import com.example.demoapp.springbootmysql.model.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployees();
	void insertEmployee(Employee employee);
}
