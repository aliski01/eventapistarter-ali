package com.dcsg.eventApi.errorHandler;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.WebRequest;


@ExtendWith(MockitoExtension.class)
class GlobalExceptionHandlerTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}
	GlobalExceptionHandler globalHandler = new GlobalExceptionHandler();
	@Mock
	WebRequest req;
	
	APIException ex;


	@Test
	void testApiTExceptionHandler_TimeOut() {
		ex = new APIException("ConnectTimeoutException");
		
		ResponseEntity<?> res = globalHandler.apiExceptionHandler(ex, req);
		
		assertEquals(res.getStatusCode(), HttpStatus.GATEWAY_TIMEOUT);
		
	}
	@Test
	void testApiTExceptionHandler_Unauthorized() {
		ex = new APIException("Unauthorized");
		
		ResponseEntity<?> res = globalHandler.apiExceptionHandler(ex, req);
		
		assertEquals(res.getStatusCode(), HttpStatus.UNAUTHORIZED);
	}
	@Test
	void testApiTExceptionHandler_NotFound() {
		ex = new APIException("NotFound");
		
		ResponseEntity<?> res = globalHandler.apiExceptionHandler(ex, req);
		
		assertEquals(res.getStatusCode(), HttpStatus.NOT_FOUND);
	}
	@Test
	void testApiTExceptionHandler_BadRequest() {
		ex = new APIException("BadRequest");
		
		ResponseEntity<?> res = globalHandler.apiExceptionHandler(ex, req);
		
		assertEquals(res.getStatusCode(), HttpStatus.BAD_REQUEST);
	}
	@Test
	void testApiTExceptionHandler_Forbidden() {
		ex = new APIException("Forbidden");
		
		ResponseEntity<?> res = globalHandler.apiExceptionHandler(ex, req);
		
		assertEquals(res.getStatusCode(), HttpStatus.FORBIDDEN);
	}
	@Test
	void testApiTExceptionHandler_otherException() {
		ex = new APIException("testException");
		
		ResponseEntity<?> res = globalHandler.apiExceptionHandler(ex, req);
		
		assertEquals(res.getStatusCode(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
