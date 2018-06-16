package com.af.opd.service;

import com.af.opd.model.PatientRecordForm;

public interface PatientRecordService {

	public String addPatientRecord(PatientRecordForm patient);
	public String getPatientRecord();
}
