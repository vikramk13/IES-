package com.fintech.ies.co.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="co_triggers")
public class CoTriggers {
	
	@Id
	private Integer triggerid;
	private Integer caseNumber;
	private Date createDate;
	private String status;
	private Date updateDate;
	public CoTriggers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CoTriggers(Integer triggerid, Integer caseNumber, Date createDate, String status, Date updateDate) {
		super();
		this.triggerid = triggerid;
		this.caseNumber = caseNumber;
		this.createDate = createDate;
		this.status = status;
		this.updateDate = updateDate;
	}
	public Integer getTriggerid() {
		return triggerid;
	}
	public void setTriggerid(Integer triggerid) {
		this.triggerid = triggerid;
	}
	public Integer getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@Override
	public String toString() {
		return "CoTriggers [triggerid=" + triggerid + ", caseNumber=" + caseNumber + ", createDate=" + createDate
				+ ", status=" + status + ", updateDate=" + updateDate + "]";
	}
	

}
