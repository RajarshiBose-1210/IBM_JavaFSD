import com.ibm.lib.Books;
import com.ibm.lib.LibraryExceptions;
import com.ibm.lib.Members;

public class TestLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Books bk=new Books(1234,"The Godfather");
		Members m=new Members("Raj",4567);
		bk.status();
		try {
		bk.issueBook(m);
		bk.issueBook(m);
		bk.returnBook(m);
		bk.returnBook(m);
		}catch(LibraryExceptions l) {
		System.out.println(l.getMessage());
		}
		
	}

}
