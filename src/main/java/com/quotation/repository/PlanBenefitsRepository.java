package com.quotation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quotation.model.PlanBenefits;
import com.quotation.model.QuotationUserDetails;


public interface PlanBenefitsRepository extends JpaRepository<PlanBenefits, Long>{

	
}
