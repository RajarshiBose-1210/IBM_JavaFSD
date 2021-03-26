package com.ibm.streaming;

public class User {
	
	private String name;
	private int age;
	private char gender;
	private double balance;
	public User(String name, int age, char gender, double balance) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.balance = balance;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void profile()
	{
		System.out.println("Your profile is ---------");
		System.out.println("Name :"+name);
		System.out.println("Gender :"+gender);
		System.out.println("Age :"+age);;
		System.out.println("Balance Amount : Rs."+balance);
	}
	
	public void mySubscription(Subscription s) throws InsufficientBalanceException {
		
	if(s.isExpiry()==true && balance>=s.getPlan())
		{
		balance-=s.getPlan();
		s.setExpiry(false);
		}
	else if(s.isExpiry()==true && balance<s.getPlan())
		throw new InsufficientBalanceException("Warning: You have insufficient balance.");
		
	}
	
	

}
