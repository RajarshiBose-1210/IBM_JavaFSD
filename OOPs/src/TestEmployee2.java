import com.ibm.emp.Employee;
import com.ibm.emp.Executive;
import com.ibm.emp.Manager;

public class TestEmployee2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee("POIU",4500.45);
		Manager m=new Manager("ABCD",4500.45,1000);
		Executive ex=new Executive("REDS",5000,2000);
		e.print();
		m.print();
		ex.print();
		showsalary(m);
		showsalary(ex);
		

	}
//example of polymorphism as Employee class is used in different contexts for Executive and Manager
	private static void showsalary(Employee e) {
		// TODO Auto-generated method stub
		if (e instanceof Manager)
			System.out.println("Manager Salary: "+e.getSalary());
		else
			System.out.println("Executive Salary: "+e.getSalary());
	}
	
	
//These are not polymorphism
/*	private static void showsalary(Executive ex) {
		// TODO Auto-generated method stub
		System.out.println("Executive Salary: "+ex.getSalary());
	}

	private static void showsalary(Manager m) {
		// TODO Auto-generated method stub
		System.out.println("Manager Salary: "+m.getSalary());
	}*/
	

}
