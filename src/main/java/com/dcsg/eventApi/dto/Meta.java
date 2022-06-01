package com.dcsg.eventApi.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component
public class Meta implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7836890467402076226L;
	public int total;
	public int took;
	public int page;
	public int per_page;
	public Object geolocation;
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTook() {
		return took;
	}
	public void setTook(int took) {
		this.took = took;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public Object getGeolocation() {
		return geolocation;
	}
	public void setGeolocation(Object geolocation) {
		this.geolocation = geolocation;
	}
	@Override
	public String toString() {
		return "Meta [total=" + total + ", took=" + took + ", page=" + page + ", per_page=" + per_page
				+ ", geolocation=" + geolocation + "]";
	}
	
}
