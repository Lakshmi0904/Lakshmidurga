package com.infyTel.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infyTel.domain.Customer;
import com.infyTel.dto.CustomerDTO;
import com.infyTel.repository.CustomerRepository;
@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	  @Autowired
	  private CustomerRepository  repository; 
	  
	public void insertCustomer(CustomerDTO customer) {
		repository.saveAndFlush(CustomerDTO.prepareCustomerEntity(customer));
	}
	@Override
	public Iterable<Customer> getCustomer(String address) {
		
		return repository.findByAddress(address);
	}
	
	
}
