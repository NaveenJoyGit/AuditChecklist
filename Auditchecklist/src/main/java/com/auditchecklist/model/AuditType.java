package com.auditchecklist.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class AuditType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String auditType;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "audit_id")
	private List<Questions> questions = new ArrayList<>();

	public AuditType() {
	}

	public AuditType(String auditType) {
		super();
		this.auditType = auditType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAuditType() {
		return auditType;
	}

	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

}
