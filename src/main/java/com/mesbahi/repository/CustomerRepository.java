package com.mesbahi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mesbahi.dto.OrderResponse;
import com.mesbahi.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

	   @Query("SELECT com.mesbahi.dto.OrderResponse(c.name , p.productName) FROM Customer c JOIN c.products p")
	    public List<OrderResponse> getJoinInformation();
	}
