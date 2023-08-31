package com.quotation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "UserPolicyQuestions")
public class PolicyQuestions {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	 @Column
	  private long planId;
	 
	 @Column
	  private long userId;
	 @Column
	  private long QUDId;
	 @Column
	  private String question;
	 @Column
	  private String answer;
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
	public long getQUDId() {
		return QUDId;
	}
	public void setQUDId(long qUDId) {
		QUDId = qUDId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	 
}
