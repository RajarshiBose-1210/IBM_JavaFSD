
public interface Events {
	void doSomething();

}

class eventImpl implements Events{

	public void doSomething()
	{
		System.out.println("First Task");
	}
	class innerEventImpl implements Events{
		
		public void doSomething()
		{
			System.out.println("Second Task");
		}
	}
	public void oneMoreImpl()
	{
		class NestedImpl implements Events
		{
			public void doSomething()
			{
				System.out.println("Third Task");
			}
		}
		new NestedImpl().doSomething();
		}
	
	public void oneLastImpl()
	{
		Events e=new Events() {
			
			@Override
			public void doSomething() {                //Anonyomus Expresssion
				// TODO Auto-generated method stub
				System.out.println("Fourth task");
			}
		};
		e.doSomething();
	}
	
	public void pakkaLastImpl()
	{
		Events e=()->System.out.println("Fifth Task"); //Lambda expression
		e.doSomething();
	}
	
	
	public static void main(String[] args) {
		
		eventImpl e=new eventImpl();
		e.doSomething();
		innerEventImpl inner=e.new innerEventImpl();
		inner.doSomething();
		e.oneMoreImpl();
		e.oneLastImpl();
		e.pakkaLastImpl();
	}
	
}