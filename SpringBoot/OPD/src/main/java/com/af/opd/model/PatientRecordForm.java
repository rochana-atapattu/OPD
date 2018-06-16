package com.af.opd.model;

public class PatientRecordForm {

	
	private String id;
	private Visit visit;
	
	
	public PatientRecordForm() {
		super();
	}

	public PatientRecordForm(String id, Visit visit) {
		super();
		this.id = id;
		this.visit = visit;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Visit getVisit() {
		return visit;
	}
	public void setVisit(Visit visit) {
		this.visit = visit;
	}
	
	
}
