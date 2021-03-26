package com.ibm.lib;

public class Members {
	
	private String name;
	private int mid;
	private Books book;
	public Members(String name, int mid) {
		super();
		this.name = name;
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public void status()
	{
		if(book==null)
			System.out.println(name+" has not issued any book.");
		else
			System.out.println(name+" has issued a book "+book.getTitle());
	}
	public Books getBook() {
		return book;
	}
	public void setBook(Books book) {
		this.book = book;
	}
	

}
