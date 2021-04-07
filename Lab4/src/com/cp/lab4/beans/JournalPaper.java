package com.cp.lab4.beans;

import java.time.LocalDate;


public class JournalPaper extends WrittenItem {

	private LocalDate yearPublished ;
	
	public JournalPaper(Integer id, String title, Integer nocopies, String author,LocalDate yearPublished) {
		super(id, title, nocopies, author);
		// TODO Auto-generated constructor stub
		this.yearPublished=yearPublished;
	}

	public JournalPaper() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the yearPublished
	 */
	public LocalDate getYearPublished() {
		return yearPublished;
	}

	/**
	 * @param yearPublished the yearPublished to set
	 */
	public void setYearPublished(LocalDate yearPublished) {
		this.yearPublished = yearPublished;
	}

	@Override
	public String toString() {
		return "JournalPaper [yearPublished=" + yearPublished + ", getAuthor()=" + getAuthor() + ", getTitle()="
				+ getTitle() + ", getNocopies()=" + getNocopies() + ", getId()=" + getId() + "]";
	}
	

}
