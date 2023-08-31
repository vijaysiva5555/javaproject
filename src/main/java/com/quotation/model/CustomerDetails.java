package com.quotation.model;



	import java.sql.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;
	import javax.persistence.Table;

	@Entity
	@Table(name = "CustomerInsDetails")
	public class CustomerDetails {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long planId;

		@Column
		private long userId;
		@Column
		private long QUDId;
		@Column
		private Date emiratesExpirydate;
		@Column
		private String birthPlace;
		@Column
		private Float cusWeight;
		@Column
		private Float cusHeight;
		@Column
		private String maritalStatus;
		@Column
		private String companyName;
		@Column
		private String jobTitle;
		@Column
		private String exactDutynature;
		@Column
		public String cusIndustries;
		@Column
		private long incomeAED;
		@Column
		private String incomeCurrency;
		@Column
		private String premiumSource;
		@Column
		private String insPurpose;
		@Column
		private long passportNo;
		@Column
		private Date issuedDate;
		@Column
		private Date expiryDate;
		@Column
		private String issuedPlace;
		@Column
		private String cusNationality;
		@Column
		private int status;
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
		public long getQUDId() {
			return QUDId;
		}
		public void setQUDId(long qUDId) {
			QUDId = qUDId;
		}
		public Date getEmiratesExpirydate() {
			return emiratesExpirydate;
		}
		public void setEmiratesExpirydate(Date emiratesExpirydate) {
			this.emiratesExpirydate = emiratesExpirydate;
		}
		public String getBirthPlace() {
			return birthPlace;
		}
		public void setBirthPlace(String birthPlace) {
			this.birthPlace = birthPlace;
		}
		public Float getCusWeight() {
			return cusWeight;
		}
		public void setCusWeight(Float cusWeight) {
			this.cusWeight = cusWeight;
		}
		public Float getCusHeight() {
			return cusHeight;
		}
		public void setCusHeight(Float cusHeight) {
			this.cusHeight = cusHeight;
		}
		public String getMaritalStatus() {
			return maritalStatus;
		}
		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getJobTitle() {
			return jobTitle;
		}
		public void setJobTitle(String jobTitle) {
			this.jobTitle = jobTitle;
		}
		public String getExactDutynature() {
			return exactDutynature;
		}
		public void setExactDutynature(String exactDutynature) {
			this.exactDutynature = exactDutynature;
		}
		public String getCusIndustries() {
			return cusIndustries;
		}
		public void setCusIndustries(String cusIndustries) {
			this.cusIndustries = cusIndustries;
		}
		public long getIncomeAED() {
			return incomeAED;
		}
		public void setIncomeAED(long incomeAED) {
			this.incomeAED = incomeAED;
		}
		public String getIncomeCurrency() {
			return incomeCurrency;
		}
		public void setIncomeCurrency(String incomeCurrency) {
			this.incomeCurrency = incomeCurrency;
		}
		public String getPremiumSource() {
			return premiumSource;
		}
		public void setPremiumSource(String premiumSource) {
			this.premiumSource = premiumSource;
		}
		public String getInsPurpose() {
			return insPurpose;
		}
		public void setInsPurpose(String insPurpose) {
			this.insPurpose = insPurpose;
		}
		public long getPassportNo() {
			return passportNo;
		}
		public void setPassportNo(long passportNo) {
			this.passportNo = passportNo;
		}
		public Date getIssuedDate() {
			return issuedDate;
		}
		public void setIssuedDate(Date issuedDate) {
			this.issuedDate = issuedDate;
		}
		public Date getExpiryDate() {
			return expiryDate;
		}
		public void setExpiryDate(Date expiryDate) {
			this.expiryDate = expiryDate;
		}
		public String getIssuedPlace() {
			return issuedPlace;
		}
		public void setIssuedPlace(String issuedPlace) {
			this.issuedPlace = issuedPlace;
		}
		public String getCusNationality() {
			return cusNationality;
		}
		public void setCusNationality(String cusNationality) {
			this.cusNationality = cusNationality;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		
		
}
