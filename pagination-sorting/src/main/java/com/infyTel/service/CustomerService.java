package com.infyTel.service;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.infyTel.domain.Customer;
import com.infyTel.dto.CustomerDTO;
public interface CustomerService {
	public void insertCustomer(CustomerDTO Customer) ;
	Page<Customer> findAll(Pageable page);
	List<Customer> findAll(Sort sort);
}