package com.af.opd.trash;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.af.opd.model.Examinations;

@RestController
@RequestMapping("/examinations")
public class ExaminationController {

	@Autowired
	VisitService visitService;
	
	@PostMapping
	public void setExam(@RequestBody Examinations exam) {
		visitService.saveExamination(exam);
	}
	
	
}
