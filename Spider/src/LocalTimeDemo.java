import java.time.*;
public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			LocalTime t1=LocalTime.now();
			System.out.println(t1);
			LocalTime t2=LocalTime.of(6,30,05);
			System.out.println(t2);
			System.out.println(t2.getHour());
	
	}

}
