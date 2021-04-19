package com.auditchecklist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.auditchecklist.model.AuditType;
import com.auditchecklist.model.Questions;
import com.auditchecklist.services.AuditTypeServices;
import com.auditchecklist.services.QuestionsServices;

@SpringBootApplication
public class AuditchecklistApplication implements CommandLineRunner {

	@Autowired
	QuestionsServices questionService;
	
	@Autowired
	AuditTypeServices auditService;
	
	public static void main(String[] args) {
		SpringApplication.run(AuditchecklistApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		AuditType a1 = new AuditType("Internal");
		AuditType a2 = new AuditType("SOX");
		
		
		
		Questions q1 = new Questions("Have all channge requests followed SDLC before PROD move?");
		Questions q2 = new Questions("Have all changes been approved by the applcation owner?");
		Questions q3 = new Questions("Are all artifacts like CR document, unit test cases available?");
		Questions q4 = new Questions("Is the SIT and UAT sign off available?");
		Questions q5 = new Questions("Is data deletion from the system done with the application owner approval?");
		
		
		Questions q6 = new Questions("Have all channge requests followed SDLC before PROD move?");
		Questions q7 = new Questions("Have all changes been approved by the applcation owner?");
		Questions q8 = new Questions("For a mojor change, was there a database backup taken before and after a PROD move?");
		Questions q9 = new Questions("Has the application owner approval obtained while adding a user to the system?");
		Questions q10 = new Questions("Is data deletion from the system done with the application owner approval?");
		
		
		a1.getQuestions().add(q1);
		a1.getQuestions().add(q2);
		a1.getQuestions().add(q3);
		a1.getQuestions().add(q4);
		a1.getQuestions().add(q5);
		
		a2.getQuestions().add(q6);
		a2.getQuestions().add(q7);
		a2.getQuestions().add(q8);
		a2.getQuestions().add(q9);
		a2.getQuestions().add(q10);
		
		auditService.save(a1);
		auditService.save(a2);
		
	}

}
