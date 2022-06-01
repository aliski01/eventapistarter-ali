package com.dcsg.eventApi.errorHandler;

public class APIException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public APIException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public APIException(Exception e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
	
}
