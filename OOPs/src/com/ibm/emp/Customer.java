package com.ibm.emp;

public class Customer {

	private int custId;
	private String custName;
	private double creditLimit;
	public static int autoUpdate;
	
	static {
		autoUpdate=1000;
	}
	public Customer() {
	this("Anonymous",-1);	// TODO Auto-generated constructor stub
	}
	public Customer(String custName, double creditLimit) {
		super();
		this.custId = autoUpdate++;
		this.custName = custName;
		this.creditLimit = creditLimit;
	}
	
	public void print() {
		
		System.out.println("Customer ID:"+custId+"\nCustomer Name:"+custName+"\nCredit Limit:"+creditLimit);
	}
	
}
