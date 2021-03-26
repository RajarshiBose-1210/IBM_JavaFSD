
public class Car {
	private String model;
	private String[] features;
	public Car(String model, String...features) {//varags
		super();
		this.model = model;
		this.features = features;
	}
	public void specs()
	{
		System.out.println("Features of "+model+"  --------");
		for(String f:features)
			System.out.println("> "+f);
		
	}
	public static void main(String[] args) {
		
		String fhect[]= {"Climate Control","ABS","Airbags"};
		Car auto=new Car("Alto","Keyless Entry","Air Condition", "Power Steering");
		Car hector=new Car("Hector",fhect);
		auto.specs();
		hector.specs();
		
	}

}
