package com.example.demoapp.springbootmysql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoapp.springbootmysql.dao.EmployeeDao;
import com.example.demoapp.springbootmysql.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	public List<Employee> getAllEmployees() {
		List<Employee> employees = employeeDao.getAllEmployees();
		return employees;
	}

	@Override
	public void insertEmployee(Employee employee) {
		employeeDao.insertEmployee(employee);

	}

}
