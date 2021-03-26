import com.ibm.currency.CurrencyConverter;
import com.ibm.currency.INR;
import com.ibm.currency.USD;

public class TestCurrency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INR inr=new INR();
		USD usd=new USD();
		CurrencyConverter cc=new CurrencyConverter();
		System.out.println(cc.convert(inr, usd, 1000));
		System.out.println(cc.convert(usd, inr, 1000));

	}

}
