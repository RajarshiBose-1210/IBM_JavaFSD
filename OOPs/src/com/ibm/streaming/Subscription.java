package com.ibm.streaming;

public class Subscription {
	
	private int plan;
	private boolean expiry;
	public Subscription(int plan, boolean expiry) {
		super();
		this.plan = plan;
		this.expiry = expiry;
	}
	public int getPlan() {
		return plan;
	}
	public void setPlan(int plan) {
		this.plan = plan;
	}
	public boolean isExpiry() {
		return expiry;
	}
	public void setExpiry(boolean expiry) {
		this.expiry = expiry;
	}
	
	
	

}
