package com.af.opd.model;

import java.util.UUID;

public class Treatment {
	
	
	private String treatmentType;
	private String remark;
	public Treatment() {
		super();
	}
	public Treatment(String treatmentType, String remark) {
		super();
		this.treatmentType = treatmentType;
		this.remark = remark;
	}
	
	public String getTreatmentType() {
		return treatmentType;
	}
	public void setTreatmentType(String treatmentType) {
		this.treatmentType = treatmentType;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	
	
}
