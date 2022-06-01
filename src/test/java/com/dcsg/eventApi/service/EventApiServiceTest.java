package com.dcsg.eventApi.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


class EventApiServiceTest {
	Logger logger = LoggerFactory.getLogger(EventApiServiceTest.class);

	EventApiService service;

	@BeforeAll
	public static void setUpBeforeClass() throws Exception {

	}

	@BeforeEach
	void setup() {
		service = new EventApiService();

		

		MockitoAnnotations.openMocks(this);

	}

	

}
