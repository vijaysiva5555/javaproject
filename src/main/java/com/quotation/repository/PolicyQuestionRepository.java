package com.quotation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quotation.model.PolicyQuestions;


public interface PolicyQuestionRepository extends JpaRepository<PolicyQuestions, Long>{

}
