
public class StaticDemo {
	
	private int data;
	private static int count;
	public StaticDemo(int data) {
		super();
		this.data = data;
		count++;
	}
	
	public void print()
	{
		System.out.println("Data:"+data+"\tCount:"+count);
	}
	
	public static void main(String[] args) {
		
		StaticDemo s1=new StaticDemo(100);
		s1.print();
		StaticDemo s2=new StaticDemo(200);
		s1.print();
		StaticDemo s3=new StaticDemo(300);
		
	    s1.print();
	    s2.print();
	    s3.print();
	}

}
