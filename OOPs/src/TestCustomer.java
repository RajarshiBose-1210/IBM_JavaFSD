import com.ibm.emp.Customer;
import com.ibm.emp.FixedCustomer;

public class TestCustomer {
	public static void main(String[] args) {
		
		Customer c=new Customer("PLMN",4500.12);
		c.print();
		FixedCustomer f=new FixedCustomer("LILY",4500.12,20);
		f.print();
	}

}
