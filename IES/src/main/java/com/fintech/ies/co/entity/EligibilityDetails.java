package com.fintech.ies.co.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Eligibility_Details")
public class EligibilityDetails {
	
	@Id
	private Integer edTraceIdNumber;
	private  String benefitAmount;
	private Integer caseNum;
	private Date createDate;
	private String denialReason;
	private String planEndDate;
	private String planName;
	private String planStartDate;
	private String planStatus;
	private Date updateDate;
	public EligibilityDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EligibilityDetails(Integer edTraceIdNumber, String benefitAmount, Integer caseNum, Date createDate,
			String denialReason, String planEndDate, String planName, String planStartDate, String planStatus,
			Date updateDate) {
		super();
		this.edTraceIdNumber = edTraceIdNumber;
		this.benefitAmount = benefitAmount;
		this.caseNum = caseNum;
		this.createDate = createDate;
		this.denialReason = denialReason;
		this.planEndDate = planEndDate;
		this.planName = planName;
		this.planStartDate = planStartDate;
		this.planStatus = planStatus;
		this.updateDate = updateDate;
	}
	public Integer getEdTraceIdNumber() {
		return edTraceIdNumber;
	}
	public void setEdTraceIdNumber(Integer edTraceIdNumber) {
		this.edTraceIdNumber = edTraceIdNumber;
	}
	public String getBenefitAmount() {
		return benefitAmount;
	}
	public void setBenefitAmount(String benefitAmount) {
		this.benefitAmount = benefitAmount;
	}
	public Integer getCaseNum() {
		return caseNum;
	}
	public void setCaseNum(Integer caseNum) {
		this.caseNum = caseNum;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getDenialReason() {
		return denialReason;
	}
	public void setDenialReason(String denialReason) {
		this.denialReason = denialReason;
	}
	public String getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "EligibilityDetails [edTraceIdNumber=" + edTraceIdNumber + ", benefitAmount=" + benefitAmount
				+ ", caseNum=" + caseNum + ", createDate=" + createDate + ", denialReason=" + denialReason
				+ ", planEndDate=" + planEndDate + ", planName=" + planName + ", planStartDate=" + planStartDate
				+ ", planStatus=" + planStatus + ", updateDate=" + updateDate + "]";
	}
	

}
