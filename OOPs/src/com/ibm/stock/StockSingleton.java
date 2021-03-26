package com.ibm.stock;

public final class StockSingleton {
	
	private StockSingleton() {
		// TODO Auto-generated constructor stub
	}
	private static Stock stock;
	public static Stock getstock()
	{
		if(stock==null)
			stock=new Stock();
		return stock;
	}

	
	}
	
