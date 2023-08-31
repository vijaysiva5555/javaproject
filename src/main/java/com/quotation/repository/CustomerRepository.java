package com.quotation.repository;

	
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.quotation.model.CustomerDetails;


	@Repository
	public interface CustomerRepository extends JpaRepository<CustomerDetails, Long> {

	}



