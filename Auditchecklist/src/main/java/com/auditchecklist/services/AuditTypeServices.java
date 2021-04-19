package com.auditchecklist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auditchecklist.model.AuditType;
import com.auditchecklist.repositories.AuditTypeRepository;

@Service
public class AuditTypeServices {

	@Autowired
	private AuditTypeRepository auditRepo;
	
	public void save(AuditType a) {
		auditRepo.save(a);
	}
 
	public List<AuditType> getAuditByType(String type) {
		return auditRepo.findByAuditType(type);
	}
}
