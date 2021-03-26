
public class ShoppingCart {
		private double cartTotal=0;
		private Products p;
		public void track()
		{
			if(p==null)
				System.out.println("The shopping cart is empty");
			else
				System.out.println("The cart has items worth "+cartTotal);
		}
		public void add(Products newProd)
		{
			if(cartTotal+newProd.getPrice()>=1000.0)
				System.out.println("Cart is already full.");
			else
			{
				cartTotal+=newProd.getPrice();
				p=newProd;
			}
		}
		public void remove(Products newProd)
		{
			cartTotal-=newProd.getPrice();
			if (cartTotal==0)
				p=null;
		}
}
