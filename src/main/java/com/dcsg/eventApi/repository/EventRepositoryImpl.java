package com.dcsg.eventApi.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.stereotype.Repository;

import com.dcsg.eventApi.dto.Event;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;


@Repository
public class EventRepositoryImpl implements EventRepository {

	private static final Logger log = LoggerFactory.getLogger(EventRepositoryImpl.class);
	@Autowired
	public RedisTemplate<String, String> redisTemplate;
	@Autowired
	ObjectMapper mapper;
	public static final String HASH_KEY = "EVENTTest";
	public HashOperations<String, String, String> hashOperations;//to access redis cache

	public EventRepositoryImpl(RedisTemplate<String, String> redisTemplate) {
		this.redisTemplate = redisTemplate;
		hashOperations = redisTemplate.opsForHash();
	}
	
	@Override
	@Cacheable(key="#id", value="HASH_KEY")
	public Event findById(String id) throws Exception {
		String dataById = hashOperations.get(HASH_KEY, id);
		Event event = null;
		if(StringUtils.isEmpty(dataById)) {
			System.out.println("String is null");
			throw new Exception();
		}
		try {
			event = mapper.readValue(dataById, Event.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  event;
	}
	/*
	 * @Override public void update(Event event) { save(event); }
	 * 
	 * @Override public void delete(String id) { hashOperations.delete(HASH_KEY,
	 * id); }
	 */
	@Override
	@Cacheable(value="HASH_KEY")
	public List<Event> findAll(final int pageNum, final int pageSize) {
		// Please validate the pageNum and pageSize in Controller that should be positive numbers
		int tmpIndex = 0;
		int tmpEndIndex = 0;
		final List<Event> events = new ArrayList<>();
		try (Cursor<Entry<Object, Object>> cursor = redisTemplate.opsForHash().scan(HASH_KEY,
				ScanOptions.scanOptions().match("*").build())) {
			while (cursor.hasNext()) {
				if (tmpIndex >= (pageNum-1)*pageSize && tmpEndIndex < pageSize) {
					final Entry<Object, Object> entry = cursor.next();					
				    Object event = entry.getValue();
				    
					Event eventData = mapper.readValue(event.toString(), Event.class);
					events.add(eventData);
					tmpIndex++;
					tmpEndIndex++;
					continue;
				}
				if (tmpEndIndex >= pageSize) {
					break;
				}
				tmpIndex++;
				cursor.next();
			}
		} catch (Exception ex) {
			log.info("Exception while fetching data from redis cache : " + ex);
			if (log.isInfoEnabled()) {
				
			}
		}
		return events;
	}

	

}
