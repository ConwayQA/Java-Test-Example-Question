package com.qa.testdrivendevelopment;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class QuestionTest {

	private Questions questions = new Questions();	
	
	@Test
	public void iBeforeETest() {
		assertTrue(questions.iBeforeE("ceiling"));
		assertTrue(questions.iBeforeE("believe"));
		assertFalse(questions.iBeforeE("glacier"));
		assertFalse(questions.iBeforeE("height"));
	}
}