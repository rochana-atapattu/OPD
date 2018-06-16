package com.af.opd.model;

import java.util.UUID;


public class Examinations {


	private double height;
	private double weight;
	private double bmi;
	private double tempurature;
	private double systolicBloodPressure;
	private double diastolicBloodPressure;
	
	
	public Examinations() {
		super();
	}
	
	public Examinations(double height, double weight, double bmi, double tempurature,
			double systolicBloodPressure, double diastolicBloodPressure) {
		super();
		
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
		this.tempurature = tempurature;
		this.systolicBloodPressure = systolicBloodPressure;
		this.diastolicBloodPressure = diastolicBloodPressure;
		System.out.println("saving ex");
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getBmi() {
		return bmi;
	}
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	public double getTempurature() {
		return tempurature;
	}
	public void setTempurature(double tempurature) {
		this.tempurature = tempurature;
	}
	public double getSystolicBloodPressure() {
		return systolicBloodPressure;
	}
	public void setSystolicBloodPressure(double systolicBloodPressure) {
		this.systolicBloodPressure = systolicBloodPressure;
	}
	public double getDiastolicBloodPressure() {
		return diastolicBloodPressure;
	}
	public void setDiastolicBloodPressure(double diastolicBloodPressure) {
		this.diastolicBloodPressure = diastolicBloodPressure;
	}

	
	
	
	
}
