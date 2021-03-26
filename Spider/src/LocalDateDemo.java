import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LocalDate l1=LocalDate.now();
		System.out.println(l1);
		LocalDate l2=LocalDate.of(2012, 10, 12);
		System.out.println(l2);
		
		LocalDate l3=LocalDate.parse("1997-10-12");
		System.out.println(l3);
		
		System.out.println(l1.plusDays(1));
		System.out.println(l1.minus(1,ChronoUnit.MONTHS));
		System.out.println(l2.getDayOfMonth());
		System.out.println(l2.getDayOfYear());
	}

}
