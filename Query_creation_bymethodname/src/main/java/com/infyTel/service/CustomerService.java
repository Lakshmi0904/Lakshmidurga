package com.infyTel.service;
import com.infyTel.domain.Customer;
import com.infyTel.dto.CustomerDTO;
public interface CustomerService {
	public void insertCustomer(CustomerDTO Customer) ;
	public Iterable<Customer> getCustomer(String address);
}