package com.dcsg.eventApi.dto;

import java.io.Serializable;

public class Message implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5325519389298248169L;
	public String text;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Override
	public String toString() {
		return "Message [text=" + text + "]";
	}
	
}
