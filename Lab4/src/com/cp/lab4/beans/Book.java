package com.cp.lab4.beans;

public class Book extends WrittenItem {

	public Book(Integer id, String title, Integer nocopies, String author) {
		super(id, title, nocopies, author);
		// TODO Auto-generated constructor stub
	}

	public Book() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Book [getAuthor()=" + getAuthor() + ", getTitle()=" + getTitle() + ", getNocopies()=" + getNocopies()
				+ ", getId()=" + getId() + "]";
	}



}
