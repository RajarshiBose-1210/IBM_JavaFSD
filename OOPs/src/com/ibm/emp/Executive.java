package com.ibm.emp;
public class Executive extends Employee {   //SPECIALISED CLASS

	private double commission;
	
	public Executive() {
		// TODO Auto-generated constructor stub
	}

	public Executive(String empName, double salary, double commission) {
		super(empName, salary);
		// TODO Auto-generated constructor stub
		this.commission=commission;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		super.print();
		System.out.println("Commission:"+commission);
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+commission;
	}
	
	

}
