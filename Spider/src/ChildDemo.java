
public class ChildDemo<Z ,A> extends NewDemo<Z> {

	private A temp;

	public ChildDemo(Z data,A temp) {
		super(data);
		this.temp=temp;
		// TODO Auto-generated constructor stub
	}
	

	public A getTemp() {
		return temp;
	}


	public void setTemp(A temp) {
		this.temp = temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildDemo<String, Integer> ch=new ChildDemo<String, Integer>("ABC", 1000);
		System.out.println(ch.getTemp());

	}

}
