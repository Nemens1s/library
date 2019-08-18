package com.sda.library.LibraryExample;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LibraryExampleApplication {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Book book = context.getBean("book", Book.class);

		book.setTitle("Effective Java 1.6");
		book.setGenre("Education");
		book.setPages(500);
		book.setAuthor("Some smart guy");
		Library library = context.getBean("library", Library.class);
		library.setAddress("Estonia pst");
		library.setNameOfLibrary("Keskraamatukogu");
		library.setNumberOfBooks(1);
		library.addBooksToLibrary(book);
		library.login();
		library.register();

		System.out.println(library.toString());

	}

}
