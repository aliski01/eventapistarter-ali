package com.dcsg.eventApi.dto;

import java.io.Serializable;

public class DocumentSource implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6873080650005591504L;
	public String source_type;
    public String generation_type;
	public String getSource_type() {
		return source_type;
	}
	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}
	public String getGeneration_type() {
		return generation_type;
	}
	public void setGeneration_type(String generation_type) {
		this.generation_type = generation_type;
	}
	@Override
	public String toString() {
		return "DocumentSource [source_type=" + source_type + ", generation_type=" + generation_type + "]";
	}
    
}
