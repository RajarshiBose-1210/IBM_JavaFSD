package com.ibm.currency;

public class CurrencyConverter {
	public double convert(Currency source,Currency target,double amount)
	{
		double val=source.usd()/target.usd();
		return amount*val;
		
	}

}
