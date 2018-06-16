package com.af.opd.model;

import java.util.List;

public class PatientHistory {
	
	private List<Examinations> exam;
	private List<LabTest> labtest;
	private List<Prescription> pres;
	private List<Treatment> treat;
	private List<Vaccine> vaccine;
	public PatientHistory() {
		super();
	}
	public PatientHistory(List<Examinations> exam, List<LabTest> labtest, List<Prescription> pres,
			List<Treatment> treat, List<Vaccine> vaccine) {
		super();
		this.exam = exam;
		this.labtest = labtest;
		this.pres = pres;
		this.treat = treat;
		this.vaccine = vaccine;
	}
	public List<Examinations> getExam() {
		return exam;
	}
	public void setExam(List<Examinations> exam) {
		this.exam = exam;
	}
	public List<LabTest> getLabtest() {
		return labtest;
	}
	public void setLabtest(List<LabTest> labtest) {
		this.labtest = labtest;
	}
	public List<Prescription> getPres() {
		return pres;
	}
	public void setPres(List<Prescription> pres) {
		this.pres = pres;
	}
	public List<Treatment> getTreat() {
		return treat;
	}
	public void setTreat(List<Treatment> treat) {
		this.treat = treat;
	}
	public List<Vaccine> getVaccine() {
		return vaccine;
	}
	public void setVaccine(List<Vaccine> vaccine) {
		this.vaccine = vaccine;
	}
	
	

}
