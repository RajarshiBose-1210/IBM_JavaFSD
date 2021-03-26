package com.ibm.emp;

public class Employee {    //GENERALISED CLASS
	
	private int empId;
	private String empName;
	private double salary;
	private static int autogen;
	
	static {
		autogen=1001;
	}
	
	public Employee() {
		this("anonymous",-1);
	}
	public Employee(String empName, double salary) {
		super();
		this.empId = autogen++;
		this.empName = empName;
		this.salary = salary;
	}
	
	public void print()
	{
		System.out.println("Employee ID: "+empId+"\nEmployee Name:"+empName+"\nSalary:"+salary);
	}


	public double getSalary() {
		return salary;
	}
	
	
}
