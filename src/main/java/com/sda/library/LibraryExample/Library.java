package com.sda.library.LibraryExample;

import com.sda.library.LibraryExample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Library {

    private String nameOfLibrary;
    private String address;
    private int numberOfBooks;
    private List<Book> listOfBooks;
    private UserService userService;


    @Autowired
    public Library(UserService userService) {
        this.userService = userService;
    }

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

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
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
