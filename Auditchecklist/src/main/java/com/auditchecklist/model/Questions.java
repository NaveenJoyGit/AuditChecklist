package com.auditchecklist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Questions {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String question;


	public Questions() {
	}

	public Questions(String question) {
		super();
		this.question = question;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}


}
