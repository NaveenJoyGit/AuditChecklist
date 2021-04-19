package com.auditchecklist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditchecklist.model.AuditType;

@Repository
public interface AuditTypeRepository extends JpaRepository<AuditType, Long> {

	List<AuditType> findByAuditType(String auditType);
	
}
