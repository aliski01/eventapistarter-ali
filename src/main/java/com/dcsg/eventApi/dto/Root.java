package com.dcsg.eventApi.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class Root implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -7180433295651440508L;
	private ArrayList<Event> events;
    private Meta meta;
    
    public ArrayList<Event> getEvents() {
		return events;
	}
	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}
	public Meta getMeta() {
		return meta;
	}
	public void setMeta(Meta meta) {
		this.meta = meta;
	}
	@Override
	public String toString() {
		return "Root [events=" + events + ", meta=" + meta + "]";
	}
	
	
}
