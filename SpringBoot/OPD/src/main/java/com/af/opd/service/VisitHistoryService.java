package com.af.opd.service;

import java.util.List;

import com.af.opd.model.PatientHistory;
import com.af.opd.model.Visit;

public interface VisitHistoryService {

	
	public String getVisitHistory();

	PatientHistory visitHistory(String pId);
	

}
