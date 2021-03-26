
public class TestCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Products p=new Products(500,"ABC");
		Products p2=new Products(300,"CDE");
		Products p3=new Products(300,"EFG");
		ShoppingCart s=new ShoppingCart();
		s.track();
		s.add(p);
		s.track();
		s.add(p2);
		s.add(p3);
		s.add(p);
		s.remove(p);
		s.track();
	}

}
