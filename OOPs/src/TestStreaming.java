import com.ibm.streaming.*;
public class TestStreaming {

	public static void main(String[] args) {
		
		User u=new User("Rajarshi", 25, 'M', 120);
		Subscription s=new Subscription(100, true);
		u.profile();
		try {
			u.mySubscription(s);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		u.profile();
		Media m1=new Movies("Shawshank Redemption", "Erotic", 130);
		try {
			m1.play(u,s);
		} catch (AgeRestrictionException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		//m1.free(true, s);
		
		// TODO Auto-generated method stub

	}

}
