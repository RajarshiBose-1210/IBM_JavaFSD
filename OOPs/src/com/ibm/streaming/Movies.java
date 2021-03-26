package com.ibm.streaming;

public class Movies extends Media {

	private int duration;
	public Movies(String title, String genre, int duration) {
		super(title, genre);
		this.duration = duration;
	}
	@Override
	public void play(User u, Subscription s) throws AgeRestrictionException {
		// TODO Auto-generated method stub
		super.play(u, s);
		System.out.println("Movie title is :"+title);
		System.out.println("Movie genre is :"+genre);
		System.out.println("Movie duration is :"+duration);
	}
	
	

}
