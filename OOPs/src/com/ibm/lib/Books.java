package com.ibm.lib;

public class Books {
	private int ISBN;
	private String title;
	private Members mem=null;
	public static int count=0;
	public Books(int iSBN, String title) {
		super();
		this.ISBN = iSBN;
		this.title = title;
	}
	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void status()
	{
		if (mem==null)
			System.out.println(title+" has not been issued to any member.");
		else
			{
			System.out.println(title+" has been issued by "+mem.getName());
			}
	}
	
	public void issueBook(Members m) throws LibraryExceptions
	{
		if (mem!=null)
			throw new LibraryExceptions(title+" has already been issued to "+m.getName());
		else if(m.getBook()!=null)
			throw new LibraryExceptions(m.getName()+" has already issued a book.");
		else {	
	this.mem=m;
	m.setBook(this);
	}
	}
	public void returnBook(Members m) throws LibraryExceptions
	{
		if(mem==null)
			throw new LibraryExceptions(title+" was not issued to anyone");
		else if(m.getBook()==null)
			throw new LibraryExceptions(m.getName()+ "didnot issue a book.");
		else {
		this.mem=null;;
		m.setBook(null);
	}
	}
}
