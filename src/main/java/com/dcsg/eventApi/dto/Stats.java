package com.dcsg.eventApi.dto;
import java.io.Serializable;
import java.util.ArrayList;

public class Stats implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -821032114176095553L;
	public int event_count;
    public int listing_count;
    public int average_price;
    public int lowest_price_good_deals;
    public int lowest_price;
    public int highest_price;
    public int visible_listing_count;
    public ArrayList<Integer> dq_bucket_counts;
    public int median_price;
    public int lowest_sg_base_price;
    public int lowest_sg_base_price_good_deals;
	public int getEvent_count() {
		return event_count;
	}
	public void setEvent_count(int event_count) {
		this.event_count = event_count;
	}
	public int getListing_count() {
		return listing_count;
	}
	public void setListing_count(int listing_count) {
		this.listing_count = listing_count;
	}
	public int getAverage_price() {
		return average_price;
	}
	public void setAverage_price(int average_price) {
		this.average_price = average_price;
	}
	public int getLowest_price_good_deals() {
		return lowest_price_good_deals;
	}
	public void setLowest_price_good_deals(int lowest_price_good_deals) {
		this.lowest_price_good_deals = lowest_price_good_deals;
	}
	public int getLowest_price() {
		return lowest_price;
	}
	public void setLowest_price(int lowest_price) {
		this.lowest_price = lowest_price;
	}
	public int getHighest_price() {
		return highest_price;
	}
	public void setHighest_price(int highest_price) {
		this.highest_price = highest_price;
	}
	public int getVisible_listing_count() {
		return visible_listing_count;
	}
	public void setVisible_listing_count(int visible_listing_count) {
		this.visible_listing_count = visible_listing_count;
	}
	public ArrayList<Integer> getDq_bucket_counts() {
		return dq_bucket_counts;
	}
	public void setDq_bucket_counts(ArrayList<Integer> dq_bucket_counts) {
		this.dq_bucket_counts = dq_bucket_counts;
	}
	public int getMedian_price() {
		return median_price;
	}
	public void setMedian_price(int median_price) {
		this.median_price = median_price;
	}
	public int getLowest_sg_base_price() {
		return lowest_sg_base_price;
	}
	public void setLowest_sg_base_price(int lowest_sg_base_price) {
		this.lowest_sg_base_price = lowest_sg_base_price;
	}
	public int getLowest_sg_base_price_good_deals() {
		return lowest_sg_base_price_good_deals;
	}
	public void setLowest_sg_base_price_good_deals(int lowest_sg_base_price_good_deals) {
		this.lowest_sg_base_price_good_deals = lowest_sg_base_price_good_deals;
	}
	@Override
	public String toString() {
		return "Stats [event_count=" + event_count + ", listing_count=" + listing_count + ", average_price="
				+ average_price + ", lowest_price_good_deals=" + lowest_price_good_deals + ", lowest_price="
				+ lowest_price + ", highest_price=" + highest_price + ", visible_listing_count=" + visible_listing_count
				+ ", dq_bucket_counts=" + dq_bucket_counts + ", median_price=" + median_price
				+ ", lowest_sg_base_price=" + lowest_sg_base_price + ", lowest_sg_base_price_good_deals="
				+ lowest_sg_base_price_good_deals + "]";
	}
    
}
