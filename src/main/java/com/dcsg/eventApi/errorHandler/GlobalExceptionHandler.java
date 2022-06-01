package com.dcsg.eventApi.errorHandler;

import java.util.Date;

import org.apache.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	//handle specific exception
	/*
	 * @ExceptionHandler(ResourceAccessException.class) public ResponseEntity<?>
	 * gatewayTimeoutException(ResourceAccessException ex, WebRequest req) {
	 * 
	 * ErrorResponse errorResponse = new ErrorResponse(new Date(),
	 * "Gateway time out exception.", req.getDescription(false)); //ErrorResponse
	 * errorResponse = new ErrorResponse();
	 * //errorResponse.setMessage("Gateway time out exception.");
	 * 
	 * return new ResponseEntity(errorResponse,null,HttpStatus.SC_GATEWAY_TIMEOUT);
	 * 
	 * }
	 */
	
	@ExceptionHandler(APIException.class)
	public ResponseEntity<?> apiExceptionHandler(APIException ex, WebRequest req)
	{
		if(ex.getMessage().contains("ConnectTimeoutException"))
		{
			ErrorResponse errorResponse = new ErrorResponse(new Date(), "Connection time out exception", req.getDescription(false));
			errorResponse.setStatus(HttpStatus.SC_GATEWAY_TIMEOUT);
			return new ResponseEntity<Object>(errorResponse,null,HttpStatus.SC_GATEWAY_TIMEOUT);
		}
		else if(ex.getMessage().contains("Unauthorized"))
		{
			ErrorResponse errorResponse = new ErrorResponse(new Date(), "Unauthorized access", req.getDescription(false));
			errorResponse.setStatus(HttpStatus.SC_UNAUTHORIZED);
			return new ResponseEntity<Object>(errorResponse,null,HttpStatus.SC_UNAUTHORIZED);
		}
		else if(ex.getMessage().contains("NotFound"))
		{
			ErrorResponse errorResponse = new ErrorResponse(new Date(), "Not Found", req.getDescription(false));
			errorResponse.setStatus(HttpStatus.SC_NOT_FOUND);
			return new ResponseEntity<Object>(errorResponse,null,HttpStatus.SC_NOT_FOUND);
		}
		else if(ex.getMessage().contains("BadRequest"))
		{
			ErrorResponse errorResponse = new ErrorResponse(new Date(), "Bad Request", req.getDescription(false));
			errorResponse.setStatus(HttpStatus.SC_BAD_REQUEST);
			return new ResponseEntity<Object>(errorResponse,null,HttpStatus.SC_BAD_REQUEST);
		}
		else if(ex.getMessage().contains("Forbidden"))
		{
			ErrorResponse errorResponse = new ErrorResponse(new Date(), "Forbidden", req.getDescription(false));
			errorResponse.setStatus(HttpStatus.SC_FORBIDDEN);
			return new ResponseEntity<Object>(errorResponse,null,HttpStatus.SC_FORBIDDEN);
		}
		else 
		{
			ErrorResponse errorResponse = new ErrorResponse(new Date(), ex.getMessage(), req.getDescription(false));
			return new ResponseEntity<Object>(errorResponse,null,HttpStatus.SC_INTERNAL_SERVER_ERROR);
		}
			

		
		
	}
}
