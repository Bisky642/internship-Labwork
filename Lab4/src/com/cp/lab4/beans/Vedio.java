package com.cp.lab4.beans;

public class Vedio extends MediaItem {
	private String director;
	private String genre;
	private Integer yearReleased;

	public Vedio(Integer id, String title, Integer nocopies, String director, String genre,Integer runTime, Integer yearReleased) {
		super(id, title, nocopies,runTime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}

	public Vedio() {
		// TODO Auto-generated constructor stub
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Integer getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(Integer yearReleased) {
		this.yearReleased = yearReleased;
	}

	@Override
	public String toString() {
		return "Vedio [director=" + director + ", genre=" + genre + ", yearReleased=" + yearReleased + ", getTitle()="
				+ getTitle() + ", getNocopies()=" + getNocopies() + ", getId()=" + getId() + "]";
	}

}
