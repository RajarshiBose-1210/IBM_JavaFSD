import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Enter name :");
		String name=console.next();
		
		String namePattern="[A-Z][a-z]{3,}";
		System.out.println("Your name is: "+(name.matches(namePattern)?"Valid":"Invalid"));
		
		System.out.println("Enter Phone number :");
		String ph=console.next();
		
		String phPattern="[7-9][0-9]{9}";
		System.out.println("Your phone number is: "+(ph.matches(phPattern)?"Valid":"Invalid"));
		
		String agePattern="[0-9][0-9]";
		System.out.println("Enter age :");
		String ag=console.next();
		System.out.println("Your age is:"+(ag.matches(agePattern)?"Valid":"Invalid"));
		
		console.close();
	}

}
