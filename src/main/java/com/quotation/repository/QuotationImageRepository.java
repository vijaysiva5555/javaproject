package com.quotation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quotation.model.QuotationImage;

public interface QuotationImageRepository extends JpaRepository<QuotationImage, Long> {
	
	Optional<QuotationImage> findByName(String fileName);

}
