package com.quotation.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.quotation.model.CustomerDetails;
import com.quotation.model.PlanBenefits;
import com.quotation.model.PolicyQuestions;
import com.quotation.model.QuotationUserDetails;
import com.quotation.model.ReviewQuotation;
import com.quotation.service.QuotationService;


import com.quotation.util.ResponseInfo;
import com.quotation.util.ResponseInfo.ResponseType;
@RestController
public class QuotationController {
	@Autowired
	QuotationService quotService;
	ModelMapper mapper = new ModelMapper();
	ResponseEntity<Object> response = null;
	
	@PostMapping("/quoatation/saveuserdetails")
	public ResponseEntity<Object> saveUserDetails(@RequestBody QuotationUserDetails input) {
		QuotationUserDetails detail = mapper.map(input, QuotationUserDetails.class);

		Map<String, Object> out =  quotService.saveUserDetails(detail);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	@PostMapping("/quoatation/saveReviewDetails")
	public ResponseEntity<Object> saveReviewDetails(@RequestBody ReviewQuotation input) {
		ReviewQuotation detail = mapper.map(input, ReviewQuotation.class);

		Map<String, Object> out =  quotService.saveReviewDetails(detail);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	@PostMapping("/quoatation/saveuserbenefits")
	public List<PlanBenefits> saveuserbenefits(@RequestBody List<PlanBenefits> input) {
		List<PlanBenefits> res = (List<PlanBenefits>) quotService.saveuserbenefits(input);
		
		    return res;
	}
	@PostMapping("/quoatation/saveuserpolicyQuestions")
	public List<PolicyQuestions> saveuserpoolicyQuestions(@RequestBody List<PolicyQuestions> input) {
		List<PolicyQuestions> res = (List<PolicyQuestions>) quotService.saveuserpolicyQuestions(input);
		
		    return res;
	}
	@PostMapping("/quoatation/savecustomerdetails")
	public ResponseEntity<Object> saveCustomerDetails(@RequestBody CustomerDetails input) {
		CustomerDetails detail = mapper.map(input, CustomerDetails.class);

		Map<String, Object> out =  quotService.saveCustomertDetails(detail);
		  response = new ResponseEntity<Object>(new ResponseInfo(ResponseType.SUCCESS, out), HttpStatus.OK);

		    return response;
	}
	@ResponseStatus(value = HttpStatus.OK)
	@PostMapping("/quoatation/upload")
	public String uploadImage(@RequestParam("quotationImage")MultipartFile file) throws IOException{
		quotService.uploadImage(file);
		return "File uploaded";
	}
}
