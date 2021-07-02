package com.infyTel.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.infyTel.domain.Customer;
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	List<Customer> findByAddress(String address);
}