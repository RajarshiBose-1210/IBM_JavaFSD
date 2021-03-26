import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class PersonalReflection {

	public static void main(String[] args) throws Exception {
		//Person p=new Person("Polo",21);
		//Class pc=p.getClass();

		Class pc=Class.forName("Person");
		System.out.println(pc.getName());
		
		Constructor[] constructors=pc.getConstructors();
		System.out.println("---- List of constructors : ");
		for (Constructor c:constructors)
			System.out.println(c);
		

		Method[] methods=pc.getMethods();
		System.out.println("---- List of methods : ");
		for (Method m:methods)
			System.out.println(m);
		Method[] dcmethods=pc.getDeclaredMethods();
		System.out.println("---- List of declared methods : ");
		for (Method m:dcmethods)
			System.out.println(m);
		Field[] fields=pc.getDeclaredFields();
		System.out.println("---- List of fields : ");
		for (Field f:fields)
			System.out.println(f);
		
		
	}
}
