package com.cp.lab4.beans;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;


public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book=new Book(01, "Java", 10, "capgemini");
		JournalPaper journal=new JournalPaper(02, "journal", 2, "Dr Manjunath",LocalDate.of(2015, Month.JANUARY, 10)); 
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
		String date = "23-Mar-2019";
		JournalPaper journal1=new JournalPaper(03, "new journal", 4, "Dr SomeOne",LocalDate.parse(date, formatter)); 
		Vedio vedio=new Vedio(04,"bahubali",4,"rajamouli","music",200,2016);
		CD cd=new CD();
		System.out.println(book);
		System.out.println(journal);
		System.out.println(journal1);
		System.out.println(vedio);
		System.out.println(cd);
	}

}
