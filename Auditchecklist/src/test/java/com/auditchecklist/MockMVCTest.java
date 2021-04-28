package com.auditchecklist;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.auditchecklist.controller.ChecklisttController;
import com.auditchecklist.model.AuditType;
import com.auditchecklist.model.Questions;
import com.auditchecklist.services.AuditTypeServices;
import com.auditchecklist.services.QuestionsServices;

@RunWith(SpringRunner.class)
@ComponentScan(basePackages = {"com.auditchecklist"})
@SpringBootTest
@AutoConfigureMockMvc
class MockMVCTest {
	

	@MockBean
	QuestionsServices q;
	
	@Autowired
	private MockMvc mvc;
	 
	@Test
	public void getAllAuditTypes() throws Exception 
	{
		
	  mvc.perform( MockMvcRequestBuilders
	      .get("/AuditCheckListQuestions/{type}", "Internal")
	      .accept(MediaType.APPLICATION_JSON))
	      .andDo(print())
	      .andExpect(status().isOk())
	      .andExpect(MockMvcResultMatchers.jsonPath("$.auditType").value("Internal"));
		
	}

}
