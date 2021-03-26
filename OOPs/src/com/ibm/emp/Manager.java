package com.ibm.emp;

public class Manager extends Employee {          //SPECIALISED CLASS
	
	private double incentives;
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String empName, double salary, double incentives) {
		super(empName, salary);
		this.incentives=incentives;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Incentives:"+incentives);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+incentives;
	}

	
	}

		

