package com.dcsg.eventApi.dto;

import java.io.Serializable;
import java.util.ArrayList;


public class CheckoutDisclosures implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ArrayList<Message> messages;
	public ArrayList<Message> getMessages() {
		return messages;
	}
	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}
	@Override
	public String toString() {
		return "CheckoutDisclosures [messages=" + messages + "]";
	}
	
	
}
