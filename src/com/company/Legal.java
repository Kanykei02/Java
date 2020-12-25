package com.company;

public class Legal extends Library{
    String name;
    static int n = 1;
    static final Book[] m1 = new Book[n];

    public Legal() {}

    public Legal(String name) {
        this.name = name;
    }

    public Legal(String idBook, String authorOfBook, String nameOfBook, String date, String name) {
        super(idBook, authorOfBook, nameOfBook, date);
        this.name = name;
    }

    public Legal(Book[][] test, String name) {
        super(test);
        this.name = name;
    }

    static void add(Book book) {
        m1[n-1] = book;
        n++;
        Library.addBooks(m1[n-2], 1);
    }

    @Override
    public String toString() {
        String info = "Book ID is: " + getIdBook() + ", Author of book: " + getAuthorOfBook() + ", Name of book: " + getNameOfBook()
                + ", Date is: " + getDate() + ", departament is: " + name;
        return info;
    }
}
