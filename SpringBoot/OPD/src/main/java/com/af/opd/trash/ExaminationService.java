package com.af.opd.trash;

import java.util.List;

import com.af.opd.model.Examinations;

public interface ExaminationService {

	public String addExamination(Examinations examination);
	public List<Examinations> getExamination();
	void getExamination(String id);
}
