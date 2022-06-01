package com.dcsg.eventApi.dto;

import java.io.Serializable;
import java.util.ArrayList;

public class Venue implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4412278394229237804L;
	public String state;
    public String name_v2;
    public String postal_code;
    public String name;
    public ArrayList<Object> links;
    public String timezone;
    public String url;
    public double score;
    public Location location;
    public String address;
    public String country;
    public boolean has_upcoming_events;
    public int num_upcoming_events;
    public String city;
    public String slug;
    public String extended_address;
    public int id;
    public int popularity;
    public Object access_method;
    public int metro_code;
    public int capacity;
    public String display_location;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName_v2() {
		return name_v2;
	}
	public void setName_v2(String name_v2) {
		this.name_v2 = name_v2;
	}
	public String getPostal_code() {
		return postal_code;
	}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Object> getLinks() {
		return links;
	}
	public void setLinks(ArrayList<Object> links) {
		this.links = links;
	}
	public String getTimezone() {
		return timezone;
	}
	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public boolean isHas_upcoming_events() {
		return has_upcoming_events;
	}
	public void setHas_upcoming_events(boolean has_upcoming_events) {
		this.has_upcoming_events = has_upcoming_events;
	}
	public int getNum_upcoming_events() {
		return num_upcoming_events;
	}
	public void setNum_upcoming_events(int num_upcoming_events) {
		this.num_upcoming_events = num_upcoming_events;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getExtended_address() {
		return extended_address;
	}
	public void setExtended_address(String extended_address) {
		this.extended_address = extended_address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPopularity() {
		return popularity;
	}
	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}
	public Object getAccess_method() {
		return access_method;
	}
	public void setAccess_method(Object access_method) {
		this.access_method = access_method;
	}
	public int getMetro_code() {
		return metro_code;
	}
	public void setMetro_code(int metro_code) {
		this.metro_code = metro_code;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getDisplay_location() {
		return display_location;
	}
	public void setDisplay_location(String display_location) {
		this.display_location = display_location;
	}
	@Override
	public String toString() {
		return "Venue [state=" + state + ", name_v2=" + name_v2 + ", postal_code=" + postal_code + ", name=" + name
				+ ", links=" + links + ", timezone=" + timezone + ", url=" + url + ", score=" + score + ", location="
				+ location + ", address=" + address + ", country=" + country + ", has_upcoming_events="
				+ has_upcoming_events + ", num_upcoming_events=" + num_upcoming_events + ", city=" + city + ", slug="
				+ slug + ", extended_address=" + extended_address + ", id=" + id + ", popularity=" + popularity
				+ ", access_method=" + access_method + ", metro_code=" + metro_code + ", capacity=" + capacity
				+ ", display_location=" + display_location + "]";
	}
    
    
}
