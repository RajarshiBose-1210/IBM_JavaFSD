
public class StringDemo {
	public static void main(String[] args) {
		String s1="Hello";
		String s2=new String ("Hello");
	    String s3="Hello";
	
	System.out.println(s1==s2);
	System.out.println(s1==s3);
	
	s1=s1+" World"; //when manipulated, new memory location is assigned
	System.out.println(s1);
	System.out.println(s1.length());
	System.out.println(s1.indexOf('o'));
	System.out.println(s1.lastIndexOf('o'));
	System.out.println(s1.charAt(6));
	System.out.println(s1.substring(4));
	System.out.println(s1.substring(3,9));
	System.out.println(s1.replace('o', 'y'));
	System.out.println(s1);

	String weeks="Sun-Mon-Tue-Wed-Thurs-Fri-Sat";
	String []days=weeks.split("-");
	for (int i = 0; i < days.length; i++) {
		System.out.println(days[i]);
	}
	}

}
