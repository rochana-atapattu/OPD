package com.af.opd.model;

import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

public class Vaccine {
	
	
	private String vaccineType;
	private String remark;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private String date;
	
	
	public Vaccine() {
		super();
	}


	public Vaccine(String vaccineType, String remark, String date) {
		super();
		this.vaccineType = vaccineType;
		this.remark = remark;
		this.date = date;
	}


	


	public String getVaccineType() {
		return vaccineType;
	}


	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}


	public String getRemark() {
		return remark;
	}


	public void setRemark(String remark) {
		this.remark = remark;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	
	
	
	
}
	