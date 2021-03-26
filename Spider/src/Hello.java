@FunctionalInterface
public interface Hello {

	String sayHello();
	default void sayHola()
	{
		System.out.println("Say Hello");
	}
	static void Bonjour()
	{
		System.out.println("Say Bonjour");
	}
}

class HelloDemo{
	
	public static void main(String[] args) {
		
		Hello h=()->"Hello World";
		Hello h2=()->{
			return "Hello";
		};
		System.out.println(h2.sayHello());
		h2.sayHola();
		Hello.Bonjour();
		}
}