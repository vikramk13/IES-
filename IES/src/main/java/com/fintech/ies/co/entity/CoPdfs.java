package com.fintech.ies.co.entity;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="co_pdfs")
public class CoPdfs {
	@Id
	private Integer id;
	private String planStatus;
	private String caseNumber;
	private Blob pdfDoc;
	private String planName;
	public CoPdfs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CoPdfs(Integer id, String planStatus, String caseNumber, Blob pdfDoc, String planName) {
		super();
		this.id = id;
		this.planStatus = planStatus;
		this.caseNumber = caseNumber;
		this.pdfDoc = pdfDoc;
		this.planName = planName;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public Blob getPdfDoc() {
		return pdfDoc;
	}
	public void setPdfDoc(Blob pdfDoc) {
		this.pdfDoc = pdfDoc;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	@Override
	public String toString() {
		return "CoPdfs [id=" + id + ", planStatus=" + planStatus + ", caseNumber=" + caseNumber + ", pdfDoc=" + pdfDoc
				+ ", planName=" + planName + "]";
	}
	
	
	
	

}
