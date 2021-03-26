package com.ibm.streaming;

public class Media {
	public String title;
	protected String genre;
	public Media(String title, String genre) {
		super();
		this.title = title;
		this.genre = genre;
	}
	
	
	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public void free(boolean b,Subscription s)
	{
		if(b==true||s.getPlan()==0||s.isExpiry()==true)
			System.out.println("Playing free medias for you.");
	}
	
	public void play(User u, Subscription s)throws AgeRestrictionException
	{
		if(s.isExpiry()==false) {
		if(u.getAge()<18&&genre=="Erotic")
			throw new AgeRestrictionException("Not Allowed for Underaged");
		else if(u.getAge()>60&&genre=="Horror")
			throw new AgeRestrictionException("Not Allowed for Old");
		}
		else
			System.out.println("No valid Subscription.");
			
	}

}
