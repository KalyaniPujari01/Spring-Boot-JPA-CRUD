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

import com.kodnest.employee.entity.Customer;
import com.kodnest.employee.service.CustomerService;

@RestController
public class CustomerControler {

	@Autowired
	CustomerService custser;
	
	@GetMapping("/getAllCustomer")
	public List<Customer> getAllCustomer(){
		return custser.findAll();
	}
	
	@GetMapping("/getCustomerById/{cusid}")
	public Customer getCustomerById(@PathVariable int cusid) {
		return custser.findCustById(cusid);
	}
	
	@PostMapping("/saveCustomer")
	public Customer saveCustomer(@RequestBody Customer custt) {
		return custser.save(custt);
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer custt) {
		return custser.save(custt);
	}
	
	@DeleteMapping("/deleteCustomerById/{custid}")
	public String deleteCustomerById(@PathVariable int custid) {
		return custser.delete(custid);
	}
	
}
