package com.auditchecklist;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.auditchecklist.controller.ChecklisttController;
import com.auditchecklist.model.AuditType;
import com.auditchecklist.model.Questions;
import com.auditchecklist.services.AuditTypeServices;

@SpringBootTest
class ControllerTest {
	
	@Mock
	AuditTypeServices auditService;
	
//	@Autowired
//	private AuditTypeServices auditService;
	
	@InjectMocks
	ChecklisttController checkListController;

	@Test
	void auditTypeTest() {
		List<Questions> questionsList = new ArrayList<Questions>();
		List<AuditType> audList = new ArrayList<AuditType>();
		Questions q1 = new Questions("How old are you");
		questionsList.add(q1);
		AuditType aud1 = new AuditType("Internal");
		aud1.setId(2l);
		aud1.setQuestions(questionsList);
		audList.add(aud1);
		when(auditService.getAuditByType("Internal")).thenReturn(audList);
		AuditType auditType = checkListController.getQuestions("Internal");
		assertNotNull(auditType);
		
	}

}
