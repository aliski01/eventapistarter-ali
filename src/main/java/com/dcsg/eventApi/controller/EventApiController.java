package com.dcsg.eventApi.controller;

import java.util.List;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.dcsg.eventApi.service.EventApiService;
import com.dcsg.eventApi.validator.EventValidation;
import com.dcsg.eventApi.dto.Event;




@RestController
public class EventApiController {

	Logger logger = LoggerFactory.getLogger(EventApiController.class);

	@Autowired
	RestTemplate restTemplate;
	@Autowired
	EventValidation validate;
	@Autowired
	EventApiService service;
	@Autowired @Qualifier("getEntity")
	HttpEntity<String> entity;

	
	/*
	 * // Returning all events
	 * 
	 * @RequestMapping(value = "/template/events") public ResponseEntity<String>
	 * getEventsList() {
	 * 
	 * String eventUri = service.getUriBuilderForAllEvents();
	 * //logger.info(eventUri); logger.info(eventUri);
	 * 
	 * ResponseEntity<String> response = null;
	 * 
	 * 
	 * try { response = restTemplate.exchange(eventUri, HttpMethod.GET, entity,
	 * String.class);
	 * logger.debug("response.getStatusCode() for get eventList :: "+response.
	 * getStatusCode()); } catch (Exception e) { e.printStackTrace();
	 * logger.error(e.getMessage()); throw new APIException(e); }
	 * 
	 * 
	 * return response; }
	 * 
	 * // Response for specific Event ID
	 * 
	 * @RequestMapping(value = "/template/events/{id}") public
	 * ResponseEntity<String> getEventForId(@PathVariable("id") String id) {
	 * 
	 * ResponseEntity<String> response = null;
	 * 
	 * String eventUri = null; if (validate.validateEventId(id)) { eventUri =
	 * service.getUriBuilderForEventById(id); } else { throw new
	 * APIException("BadRequest"); }
	 * 
	 * try { long t1 = System.currentTimeMillis(); response =
	 * restTemplate.exchange(eventUri, HttpMethod.GET, entity, String.class); long
	 * t2 = System.currentTimeMillis(); logger.info("response time: " + (t2 - t1));
	 * } catch (Exception e) { e.printStackTrace(); throw new APIException(e); }
	 * 
	 * 
	 * 
	 * 
	 * // logger.info(eventUri);
	 * 
	 * return response; }
	 */

	// Returning paginated events
		@GetMapping(value = "/template/events")
		public List<Event> getEventsList(@RequestParam(value="per_page",defaultValue = "10") int pageSize, 
				@RequestParam(value="page",defaultValue = "1") int page) {	

			if(!(pageSize>0 && page>0))
			{
				pageSize=10;
				page=1;
			}

			return service.findAll(page, pageSize);
		}

		// Response for specific Event ID
		@GetMapping("template/events/{id}")
		public ResponseEntity<Event> findById(@PathVariable("id") final String id) throws Exception {
			Event event = null;
			String eventId = StringUtils.trim(id);
			if(StringUtils.isNumeric(eventId)) {
				event = service.findById(id);
				if(ObjectUtils.isEmpty(event))
					return ResponseEntity.notFound().build();

			} else {
				return ResponseEntity.badRequest().build();
			}
			return ResponseEntity.status(HttpStatus.OK).body(event);

		}

}