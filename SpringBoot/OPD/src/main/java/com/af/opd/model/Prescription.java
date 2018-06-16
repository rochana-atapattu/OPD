package com.af.opd.model;

import java.util.UUID;

public class Prescription {
		
	
	private String dosage;
	private String instructions;
	private int period;
	
	
	
	public Prescription() {
		super();
	}


	public Prescription(String dosage, String instructions, int period) {
		super();
		
		
		this.dosage = dosage;
		this.instructions = instructions;
		this.period = period;
	}


	


	public String getDosage() {
		return dosage;
	}


	public void setDosage(String dosage) {
		this.dosage = dosage;
	}


	public String getInstructions() {
		return instructions;
	}


	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}


	public int getPeriod() {
		return period;
	}


	public void setPeriod(int period) {
		this.period = period;
	}


	
	
	
	
}
