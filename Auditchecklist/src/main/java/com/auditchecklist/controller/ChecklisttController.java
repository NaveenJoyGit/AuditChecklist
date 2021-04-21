package com.auditchecklist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.auditchecklist.model.AuditType;
import com.auditchecklist.model.Questions;
import com.auditchecklist.services.AuditTypeServices;
import com.auditchecklist.services.QuestionsServices;

@RestController
public class ChecklisttController {
	
	@Autowired
	AuditTypeServices auditService;
	

	@GetMapping("/AuditCheckListQuestions/{type}")
	public AuditType getQuestions(@PathVariable String type) {		
		return auditService.getAuditByType(type).get(0);
	}
	
}
