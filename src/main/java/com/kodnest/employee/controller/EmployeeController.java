package com.kodnest.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kodnest.employee.entity.Employee;
import com.kodnest.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empser;
	
	@GetMapping("/getallemployees")
	public List<Employee> getAllEmployee(){
		return empser.findAllEmp();
	}
	
	
	@GetMapping("/getEmpById/{empid}")
	public Employee getEmployeeById(@PathVariable int empid) {
		return empser.findEmpById(empid);
	}
	
	@PostMapping("/saveEmployee")
	public Employee saveEmployee(@RequestBody Employee emp) {
		return empser.save(emp);
	}
	
	
	@PutMapping("/updateEmployee")
	public Employee updateEmployee(@RequestBody Employee emp) {
		return empser.update(emp);
	}
	
	
	@DeleteMapping("/deleteEmployee/{empid}")
	public void deleteEmployee(@PathVariable int empid) {
		empser.delete(empid);
	}
	
}
