package com.kodnest.employee.service;

import java.util.List;

import com.kodnest.employee.entity.Employee;

public interface EmployeeService {

	
	public List<Employee> findAllEmp();
	public Employee save(Employee emp);
	public Employee update(Employee emp);
	public String delete(int id);
	public Employee getEmpById(int id);
}
