package com.quotation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quotation.model.QuotationUserDetails;



public interface UserDetailRepository extends JpaRepository<QuotationUserDetails, Long> {
	}
