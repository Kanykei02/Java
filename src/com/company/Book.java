package com.company;

import java.time.LocalDate;

public class Book {
    String idBook;
    String authorOfBook;
    String nameOfBook;
    String date;

    public Book() {}

    public Book(String idBook, String authorOfBook, String nameOfBook, String date) {
        this.idBook = idBook;
        this.authorOfBook = authorOfBook;
        this.nameOfBook = nameOfBook;
        this.date = date;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
    public String toString() {
        String info = "Book ID is: " + idBook + ", Author of book: " + authorOfBook + ", Name of book: " + nameOfBook
                + ", Date is: " + date;
        return info;
    }
}
