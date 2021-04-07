package com.cp.lab4.beans;

public class CD extends MediaItem {
	private String artist;
	private String genre;
	public CD(Integer id, String title, Integer nocopies,String artist,String genre,Integer runTime) {
		super(id, title, nocopies,runTime);
		this.artist=artist;
		this.genre=genre;
	}

	public CD() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CD [artist=" + artist + ", genre=" + genre + ", getTitle()=" + getTitle() + ", getNocopies()="
				+ getNocopies() + ", getId()=" + getId() + "]";
	}

}
