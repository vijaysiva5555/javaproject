package com.quotation.model;

import java.util.List;

public class ReviewQuotation {
 private QuotationUserDetails userDetails;
 private List<PlanBenefits> planBenefits;
 private CustomerDetails customerDetails;
 private List<PolicyQuestions> policyQuestions;
public CustomerDetails getCustomerDetails() {
	return customerDetails;
}
public void setCustomerDetails(CustomerDetails customerDetails) {
	this.customerDetails = customerDetails;
}
public List<PolicyQuestions> getPolicyQuestions() {
	return policyQuestions;
}
public void setPolicyQuestions(List<PolicyQuestions> policyQuestions) {
	this.policyQuestions = policyQuestions;
}
public QuotationUserDetails getUserDetails() {
	return userDetails;
}
public void setUserDetails(QuotationUserDetails userDetails) {
	this.userDetails = userDetails;
}
public List<PlanBenefits> getPlanBenefits() {
	return planBenefits;
}
public void setPlanBenefits(List<PlanBenefits> planBenefits) {
	this.planBenefits = planBenefits;
}
}
