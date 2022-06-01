package com.dcsg.eventApi.dto;

import java.io.Serializable;

public class Announcements implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 645169933020796616L;
	public CheckoutDisclosures checkout_disclosures;
	public CheckoutDisclosures getCheckout_disclosures() {
		return checkout_disclosures;
	}
	public void setCheckout_disclosures(CheckoutDisclosures checkout_disclosures) {
		this.checkout_disclosures = checkout_disclosures;
	}
	@Override
	public String toString() {
		return "Announcements [checkout_disclosures=" + checkout_disclosures + "]";
	}
	
	
	
    
}
