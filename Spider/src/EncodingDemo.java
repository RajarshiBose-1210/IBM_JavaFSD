import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
public class EncodingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String password="P@ssw@rd";
System.out.println(password);

Encoder encoder=Base64.getEncoder();
String encoderPassword=encoder.encodeToString(password.getBytes());
System.out.println(encoderPassword);

Decoder d=Base64.getDecoder();
String decPass=new String(d.decode(encoderPassword.getBytes()));
System.out.println(decPass);


	}

}
