package com.af.opd.trash;

import java.util.List;

import com.af.opd.model.Examinations;
import com.af.opd.model.Prescription;
import com.af.opd.model.Treatment;
import com.af.opd.model.Vaccine;
import com.af.opd.model.Visit;

public interface VisitService {
		 void saveVisit(Visit visit);

		List<Visit> getAll();

		Examinations getExam(String id);

		void saveExamination(Examinations examinations);

		void saveVaccine(Vaccine examinations);

		void saveTreatment(Treatment examinations);

		void savePrescription(Prescription examinations);

		void saveLabTest(LabTestServiceImpl examinations);

}
