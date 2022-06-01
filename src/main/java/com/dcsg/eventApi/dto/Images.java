package com.dcsg.eventApi.dto;

import java.io.Serializable;

public class Images implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7980018497320976393L;
	public String huge;
	public String getHuge() {
		return huge;
	}
	public void setHuge(String huge) {
		this.huge = huge;
	}
	@Override
	public String toString() {
		return "Images [huge=" + huge + "]";
	}
	
}
