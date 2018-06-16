package com.af.opd.domain;

import java.util.List;

import org.springframework.data.annotation.Id;

import com.af.opd.model.Visit;

public class PatientRecords {

	@Id
	private String patientId;
	private List<Visit> vist;
	
	public PatientRecords() {
		super();
	}

	public PatientRecords(String patientId, List<Visit> vist) {
		super();
		this.patientId = patientId;
		this.vist = vist;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public List<Visit> getVist() {
		return vist;
	}

	public void setVist(List<Visit> vist) {
		this.vist = vist;
	}

	
	
}
