package com.af.opd.model;

import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

public class Visit {

	@Id
	private String visitId;
	private String reason;
	private String visitType;
	private String observation;
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	private String dateTime;
	private Examinations exam;
	private LabTest labTest;
	private Prescription prescription;
	private Treatment treatment;
	private Vaccine vaccine;
	
	
	public Visit() {
		super();
	}


	public Visit(String reason, String visitType, String observation, String dateTime, Examinations exam,
			LabTest labTest, Prescription prescription, Treatment treatment, Vaccine vaccine) {
		super();
		this.visitId=UUID.randomUUID().toString();
		this.reason = reason;
		this.visitType = visitType;
		this.observation = observation;
		this.dateTime = dateTime;
		this.exam = exam;
		this.labTest = labTest;
		this.prescription = prescription;
		this.treatment = treatment;
		this.vaccine = vaccine;
	}


	public String getVisitId() {
		return visitId;
	}


	public void setVisitId(String visitId) {
		this.visitId = visitId;
	}


	public String getReason() {
		return reason;
	}


	public void setReason(String reason) {
		this.reason = reason;
	}


	public String getVisitType() {
		return visitType;
	}


	public void setVisitType(String visitType) {
		this.visitType = visitType;
	}


	public String getObservation() {
		return observation;
	}


	public void setObservation(String observation) {
		this.observation = observation;
	}


	public String getDateTime() {
		return dateTime;
	}


	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}


	public Examinations getExam() {
		return exam;
	}


	public void setExam(Examinations exam) {
		this.exam = exam;
	}


	public LabTest getLabTest() {
		return labTest;
	}


	public void setLabTest(LabTest labTest) {
		this.labTest = labTest;
	}


	public Prescription getPrescription() {
		return prescription;
	}


	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}


	public Treatment getTreatment() {
		return treatment;
	}


	public void setTreatment(Treatment treatment) {
		this.treatment = treatment;
	}


	public Vaccine getVaccine() {
		return vaccine;
	}


	public void setVaccine(Vaccine vaccine) {
		this.vaccine = vaccine;
	}

	


}
