import static com.ibm.stock.StockSingleton.*;

import java.util.concurrent.Exchanger;

import com.ibm.stock.*;
public class TestStock {

	
	public static void main(String[] args) {
		
		Holder h=getstock();
		h.view();
		
		Exchange e=StockSingleton.getstock();
		e.get();
		
		System.out.println(h==e);
	}

}
