package com.ibm.shooping;

public class Payment {
	
	private String accNo;
	private double balance;
	public Payment(String accNo, double balance) {
		super();
		this.accNo = accNo;
		this.balance = balance;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	

}
