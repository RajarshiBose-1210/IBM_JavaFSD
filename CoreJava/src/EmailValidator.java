
public class EmailValidator {
public static void main(String[] args) {
	
	String s1="zubair@mail.com";
	String s2[]=s1.split("@");
	String s3[]=s1.split("\\.");
	String s4= s1.substring(s1.indexOf('@'),s1.indexOf('.'));
	if(s2.length>2 || s3.length>2 || s2[0].length()<4 || s3[1].length()<2 || s4.length()<3)
		System.out.println("Invalid");
	else
		System.out.println("Valid");
		

	
	
}
	
}
