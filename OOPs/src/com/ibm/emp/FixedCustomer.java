package com.ibm.emp;

public class FixedCustomer extends Customer {

	private double discount;
	public FixedCustomer() {
		// TODO Auto-generated constructor stub
	}

	public FixedCustomer(String custName, double creditLimit,double discount) {
		super(custName, creditLimit);
		this.discount=discount;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("The discount is:"+ discount);
	}
	
}
