import com.ibm.shooping.Payment;
import com.ibm.shooping.PaymentException;
import com.ibm.shooping.Product;
import com.ibm.shooping.ShoppingCart;
import com.ibm.shooping.StockException;

public class TestCart {

	public static void main(String[] args) {
		
		Product p=new Product(500,"ABC",000);
		Product p2=new Product(300,"CDE",100);
		Product p3=new Product(100,"EFG",100);
		ShoppingCart s=new ShoppingCart();
		Payment pay=new Payment("1000",1555);
		// TODO Auto-generated method stub
		try {
			s.addProduct(p);
		} catch (StockException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			s.addProduct(p2);
		} catch (StockException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		//s.addProduct(p3);
		//s.addProduct(p2);
		try {
			s.checkout(pay,"HOLI");
		} catch (PaymentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
