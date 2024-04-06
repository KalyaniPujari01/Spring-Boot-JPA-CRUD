package com.kodnest.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.employee.entity.Employee;
import com.kodnest.employee.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeRepository emprep;
	
	
	
	@Override
	public List<Employee> findAllEmp() {
		return emprep.findAll();
	}



	@Override
	public Employee save(Employee emp) {
		 return emprep.save(emp);
	}



	@Override
	public Employee update(Employee emp) {
		return emprep.save(emp);
	}



	@Override
	public String delete(int id) {
		Employee em = emprep.getReferenceById(id);
		emprep.delete(em);
		return "delete success";
		
		
	}



	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
