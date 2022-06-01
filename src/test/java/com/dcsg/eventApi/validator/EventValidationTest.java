package com.dcsg.eventApi.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class EventValidationTest {
	
	Logger logger = LoggerFactory.getLogger(EventValidationTest.class);
	EventValidation eValidate;
	

	@BeforeEach
	void setUp() throws Exception {
		eValidate = new EventValidation();
	}

	@Test
	void testValidateEventId_ValidNumber() {
		assertTrue(eValidate.validateEventId("123"), "For a numaric value");
	}
	
	@Test
	void testValidateEventId_InvalidNumber() {
		assertFalse(eValidate.validateEventId("sdf2"), "For a non-numaric value");
	}	
	@Test
	void testValidateEventId_ValidNumberWithTrailingSpace() {
		assertTrue(eValidate.validateEventId("123 "), "For a numaric value with trailing space");
	}

}
