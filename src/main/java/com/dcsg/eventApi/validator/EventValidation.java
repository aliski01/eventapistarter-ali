package com.dcsg.eventApi.validator;

import org.springframework.stereotype.Service;

@Service
public class EventValidation {

	public boolean validateEventId(String id) {
		
		String eventId= id.trim();;
		
		
		try {
			Integer.parseInt(eventId);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;

	}
}
