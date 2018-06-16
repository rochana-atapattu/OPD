package com.af.opd.model;

import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

public class LabTest {

	
	private String testType;
	@DateTimeFormat(pattern = "MM/dd/yyyy HH:mm:ss")
	private String dueDate;
	private String comment;
	
	public LabTest() {
		super();
	}
	
	public LabTest(String testType, String dueDate, String comment) {
		super();
		this.testType = testType;
		this.dueDate = dueDate;
		this.comment = comment;
	}
	
	public String getTestType() {
		return testType;
	}
	public void setTestType(String testType) {
		this.testType = testType;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}


	
	
	
}
