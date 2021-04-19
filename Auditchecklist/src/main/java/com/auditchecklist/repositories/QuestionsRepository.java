package com.auditchecklist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auditchecklist.model.Questions;

@Repository
public interface QuestionsRepository extends JpaRepository<Questions, Long> {

}
