package com.kodnest.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.employee.entity.Customer;
import com.kodnest.employee.entity.Employee;
import com.kodnest.employee.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	CustomerRepository custrep;
	

	@Override
	public List<Customer> findAll() {
		return custrep.findAll();
	}
	
	
	


	@Override
	public Customer findCustById(int id) {
		Optional<Customer> cust = custrep.findById(id);
		return cust.get();
	}

	@Override
	public Customer save(Customer cust) {
		return custrep.save(cust);
	}

	@Override
	public Customer update(Customer cust) {
		return custrep.save(cust);
	}

	@Override
	public String delete(int id) {
		Customer cust = custrep.getReferenceById(id);		
		custrep.delete(cust);
		return "delete success";
		
	}

	
	
}
