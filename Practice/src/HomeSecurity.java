
public class HomeSecurity implements Security {

	@Override
	public void camera() {
		System.out.println("The camera is accessed");
	}

	@Override
	public void laser() {
		System.out.println("The laser is activated");
		
	}

	@Override
	public void alarm() {
		System.out.println("The alarm is activated.");
		
	}
	
	public static void state()
	{
		System.out.println("WE ARE ABC COMPANY");
	}

}
