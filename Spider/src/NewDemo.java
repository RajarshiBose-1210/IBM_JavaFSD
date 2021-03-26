
public class NewDemo<Z> {    //Generic
	private Z data;
	

	public NewDemo(Z data) {
		super();
		this.data = data;
	}


	public Z getData() {
		return data;
	}


	public void setData(Z data) {
		this.data = data;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewDemo<String> n=new NewDemo<String>("ABC");
		n.setData("ABC");
		System.out.println(n.getData());
		
		NewDemo<Integer> n1=new NewDemo<Integer>(1000);
		System.out.println(n1.getData());
	}

}
