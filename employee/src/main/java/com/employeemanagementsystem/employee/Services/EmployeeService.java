package com.employeemanagementsystem.employee.Services;

import java.util.List;

import com.employeemanagementsystem.employee.entity.Employee;


public interface EmployeeService {
    public Employee saveEmployee(Employee std);
	
	public List<Employee> getAllEmployee();
		
	public void deleteEmployee(int id);
	
	public Employee findByID(int id);
	
	public Employee updateStudent(Employee employee);
}
