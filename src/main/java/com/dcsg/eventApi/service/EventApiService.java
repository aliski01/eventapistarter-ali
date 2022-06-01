package com.dcsg.eventApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dcsg.eventApi.dto.Event;
import com.dcsg.eventApi.repository.EventRepository;
@Service
public class EventApiService {
	@Autowired
	EventRepository repository;
	
	public List<Event> findAll(final int pageNum, final int pageSize) {
		return repository.findAll(pageNum, pageSize);
	}
	public Event findById(String id) throws Exception {
		return repository.findById(id);
	}
}
