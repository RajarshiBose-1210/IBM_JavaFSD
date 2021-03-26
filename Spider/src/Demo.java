
public class Demo {
	
	private Object data;

	public Demo(Object data) {
		super();
		this.data = data;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	public static void main(String[] args) {
		
	
		Demo d=new Demo(100);
		d.setData(100);
		System.out.println(d.getData());
		
		
	}

}
