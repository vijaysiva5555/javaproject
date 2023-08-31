package com.quotation.service;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.quotation.model.CustomerDetails;
import com.quotation.model.PlanBenefits;
import com.quotation.model.PolicyQuestions;
import com.quotation.model.QuotationImage;
import com.quotation.model.QuotationUserDetails;
import com.quotation.model.ReviewQuotation;
import com.quotation.repository.CustomerRepository;
import com.quotation.repository.PlanBenefitsRepository;
import com.quotation.repository.PolicyQuestionRepository;
import com.quotation.repository.QuotationImageRepository;
import com.quotation.repository.UserDetailRepository;

@Configuration
public class QuotationService {
	@Autowired
	private UserDetailRepository userDetailRepo;
	@Autowired
	private PlanBenefitsRepository benefitRepo;
	@Autowired
	private PolicyQuestionRepository questionRepo; 
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private QuotationImageRepository quotationImageRepository;
	public Map<String, Object> saveUserDetails(QuotationUserDetails userDto) {
		Map<String, Object> out = new LinkedHashMap<>();
		userDetailRepo.save(userDto);
		out.put("message", "Detail Saved Successfully");
		return out;
	}
	@Transactional
	public List<PlanBenefits> saveuserbenefits(List<PlanBenefits> input) {
//		 
		List<PlanBenefits> response = (List<PlanBenefits>) benefitRepo.saveAll(input);
		
		
		
		return response;
	}
	public List<PolicyQuestions> saveuserpolicyQuestions(List<PolicyQuestions> input) {
		
		List<PolicyQuestions> response = (List<PolicyQuestions>) questionRepo.saveAll(input);
		
		return null;
	}
	public Map<String, Object> saveReviewDetails(ReviewQuotation detail) {
		userDetailRepo.save(detail.getUserDetails());
		List<PlanBenefits> response = (List<PlanBenefits>) benefitRepo.saveAll(detail.getPlanBenefits());
		customerRepo.save(detail.getCustomerDetails());
		List<PolicyQuestions> response11 =(List<PolicyQuestions>) questionRepo.saveAll(detail.getPolicyQuestions());
		System.out.println(response);
		return null;
	}
	public Map<String, Object> saveCustomertDetails(CustomerDetails userDto) {
		Map<String, Object> out = new LinkedHashMap<>();
		customerRepo.save(userDto);
		out.put("message", "Detail Saved Successfully");
		return out;
}
private final String PATH = System.getProperty("user.dir")+"\\quoimage\\";
	
	public QuotationImage uploadImage(MultipartFile file) throws IOException {
		String fullPath = PATH+file.getOriginalFilename();
		
		QuotationImage qImage = new QuotationImage();
		qImage.setName(file.getOriginalFilename());
		qImage.setType(file.getContentType());
		qImage.setImagePath(fullPath);
		
		file.transferTo(new File(fullPath));
		return quotationImageRepository.save(qImage);
	}

}
