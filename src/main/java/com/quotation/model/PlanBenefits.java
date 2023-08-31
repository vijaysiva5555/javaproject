package com.quotation.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table( name = "UserPlanBenefits")
public class PlanBenefits {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	 @Column
	  private long planId;
	 
	 @Column
	  private long userId;
//	 @OneToOne(cascade = CascadeType.ALL)
//	  @JoinColumn(name = "QUDId")
//	    private QuotationUserDetails userdetail;
	 @Column
	  private long QUDId;
	 @Column
	  private String benefits;
	 @Column
	  private String sumAssured;
	 
	
	public long getQUDId() {
		return QUDId;
	}
	public void setQUDId(long qUDId) {
		QUDId = qUDId;
	}
	
	
	@Column
	  private int term;
	 @Column
	  private int coverPremium;
	 @Column
	  private int status;
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
	
	public String getBenefits() {
		return benefits;
	}
	public void setBenefits(String benefits) {
		this.benefits = benefits;
	}
	public String getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(String sumAssured) {
		this.sumAssured = sumAssured;
	}
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	public int getCoverPremium() {
		return coverPremium;
	}
	public void setCoverPremium(int coverPremium) {
		this.coverPremium = coverPremium;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
