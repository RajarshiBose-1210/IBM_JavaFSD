@FunctionalInterface
interface Maths{
	int max(int a,int b);
}


public class MathDemo {
	public static void main(String[] args) {
		
	
	Maths m=(int x,int y)->{
		if(x>y)
			return x;
		else 
			return y;
		
	};
System.out.println(m.max(10, 20));
}
}