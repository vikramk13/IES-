 package com.fintech.ies.co.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Batch_Run_Details")
public class BatchRunDetails {

	@Id
	private Integer batchRunSequential;
	private String batchName;
	private String batchRunStatus;
	private Date endDate;
	private Integer instanceNum;
	private Date startDate;
	public BatchRunDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BatchRunDetails(Integer batchRunSequential, String batchName, String batchRunStatus, Date endDate,
			Integer instanceNum, Date startDate) {
		super();
		this.batchRunSequential = batchRunSequential;
		this.batchName = batchName;
		this.batchRunStatus = batchRunStatus;
		this.endDate = endDate;
		this.instanceNum = instanceNum;
		this.startDate = startDate;
	}
	public Integer getBatchRunSequential() {
		return batchRunSequential;
	}
	public void setBatchRunSequential(Integer batchRunSequential) {
		this.batchRunSequential = batchRunSequential;
	}
	public String getBatchName() {
		return batchName;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public String getBatchRunStatus() {
		return batchRunStatus;
	}
	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getInstanceNum() {
		return instanceNum;
	}
	public void setInstanceNum(Integer instanceNum) {
		this.instanceNum = instanceNum;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "BatchRunDetails [batchRunSequential=" + batchRunSequential + ", batchName=" + batchName
				+ ", batchRunStatus=" + batchRunStatus + ", endDate=" + endDate + ", instanceNum=" + instanceNum
				+ ", startDate=" + startDate + "]";
	}
	
	
	
	
}
