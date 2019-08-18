package com.sda.library.LibraryExample;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Library {

    private String nameOfLibrary;
    private String address;
    private int numberOfBooks;
    private List<Book> listOfBooks;


    public void addBooksToLibrary(Book book){
        this.listOfBooks = new ArrayList<>();
        this.listOfBooks.add(book);
    }

    public String getNameOfLibrary() {
        return nameOfLibrary;
    }

    public void setNameOfLibrary(String nameOfLibrary) {
        this.nameOfLibrary = nameOfLibrary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }


    @Override
    public String toString() {
        return "Library{" +
                "nameOfLibrary='" + nameOfLibrary + '\'' +
                ", address='" + address + '\'' +
                ", numberOfBooks=" + numberOfBooks +
                ", listOfBooks=" + listOfBooks +
                '}';
    }
}
