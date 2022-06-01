package com.dcsg.eventApi.repository;

import java.util.List;
import java.util.Map;

import com.dcsg.eventApi.dto.Event;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

public interface EventRepository {

	//void save(Event event);

	List<Event> findAll(int page, int pageSize);

	Event findById(String id) throws Exception;

	/*
	 * void update(Event event);
	 * 
	 * void delete(String id);
	 */

}
