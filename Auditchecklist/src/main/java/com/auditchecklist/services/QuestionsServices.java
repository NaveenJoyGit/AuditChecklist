package com.auditchecklist.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditchecklist.model.Questions;
import com.auditchecklist.repositories.QuestionsRepository;

@Service
public class QuestionsServices {

	@Autowired
	private QuestionsRepository questionRepo;
	
	@Transactional
	public void saveQuestion(Questions question) {
		questionRepo.save(question);
	}
	
	public List<Questions> findAllQuestions() {
		return questionRepo.findAll();
	}
	
}
