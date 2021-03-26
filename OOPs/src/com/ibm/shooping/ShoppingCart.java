package com.ibm.shooping;

public class ShoppingCart {
	
	public double cartTotal;
	private Product items[];
	private int idx=0;
	String coupons[][]= {{"HOLI","100"},{"DIWALI","200"}};
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
		items=new Product[5];
	}
	
	public void addProduct(Product p) throws StockException
	{
		if(idx+1<=Product.getStock())
		{
		if(idx<items.length)
		{
			items[idx++]=p;
			cartTotal+=p.getPrice();
		}
		else
			System.out.println("Cart is full.");
		}
		else
			throw new StockException("Stock is depleted");
	}
	int k;
	public void checkout(Payment pmt, String code)throws PaymentException
	{
		for(k=0;k<2;k++)
		{
			if(code.equals(coupons[k][0]))
				break;
				
		}
		if(pmt.getBalance()>=cartTotal) {
		if(items.length!=0)
		{
		for(int i=0;i<idx;i++)
		{
			System.out.println(i+1+". "+items[i].getName()+" : "+items[i].getPrice());
		}
		System.out.println("The cart total is: "+(cartTotal-Integer.parseInt(coupons[k][1])));
	}
		else
			System.out.println("The cart is empty.");
		}
		else
			throw new PaymentException("You don't have enough balance");
		}
	}
	

