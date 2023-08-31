package com.quotation.model;

import java.sql.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table( name = "QuotationUserDetails")
public class QuotationUserDetails {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	 
	 @Column
	  private long planId;
	 
	 @Column
	  private long userId;
	 @Column
	  private String title;
	 @Column
	  private String firstName;
	 @Column
	  private String middleName;
	 @Column
	  private String lastName;
	 @Column
	  private Date dob;
	 @Column
	  private String gender;
	 
	 @Column
	  private String mobile;
	 @Column
	  private String email;
	 @Column
	  private int planTermsYear;
	 @Column
	  private String currency;
	 @Column
	  private String sumAssured;
	 @Column
	  private String premiumFrequency;
	 @Column
	  private String occupationCategory;
	 @Column
	  private String occupation;
	 @Column
	  private String country;
	 @Column
	  private String promoCode;
	
	@Column
	  private int status;
	
	public int getStatus() {
		return status;
	}
	
	

	public void setStatus(int status) {
		this.status = status;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getPlanId() {
		return planId;
	}
	public void setPlanId(long planId) {
		this.planId = planId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPlanTermsYear() {
		return planTermsYear;
	}
	public void setPlanTermsYear(int planTermsYear) {
		this.planTermsYear = planTermsYear;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(String sumAssured) {
		this.sumAssured = sumAssured;
	}
	public String getPremiumFrequency() {
		return premiumFrequency;
	}
	public void setPremiumFrequency(String premiumFrequency) {
		this.premiumFrequency = premiumFrequency;
	}
	public String getOccupationCategory() {
		return occupationCategory;
	}
	public void setOccupationCategory(String occupationCategory) {
		this.occupationCategory = occupationCategory;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPromoCode() {
		return promoCode;
	}
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
}
