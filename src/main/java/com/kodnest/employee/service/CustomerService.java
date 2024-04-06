package com.kodnest.employee.service;

import java.util.List;

import com.kodnest.employee.entity.Customer;


public interface CustomerService {

	public List<Customer> findAll();
	public Customer findCustById(int id);
	public Customer save(Customer cust);
	public Customer update(Customer cust);
	public String delete(int id);
}
