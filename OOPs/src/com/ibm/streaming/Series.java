package com.ibm.streaming;

public class Series extends Media {

	private int episode;
	private int season;
	public Series(String title, String genre, int episode, int season) {
		super(title, genre);
		this.episode = episode;
		this.season = season;
	}
	@Override
	public void play(User u, Subscription s) throws AgeRestrictionException {
		// TODO Auto-generated method stub
		super.play(u, s);
		if(episode==0)
			System.out.println("Playing Season "+season+" Episode "+1+" of "+title );
		else
			System.out.println("Playing Season "+season+ " Episode "+episode+" of "+title );
	}
	@Override
	public void free(boolean b, Subscription s) {
		// TODO Auto-generated method stub
		super.free(b, s);
	}
	
	
	
	

}
