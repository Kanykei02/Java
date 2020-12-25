package com.company;

public class Technical extends Library{
    String name;
    int computer;
    static int n = 1;
    static final Book[] m1 = new Book[n];

    public Technical() {}

    public Technical(String name) {
        this.name = name;
    }

    public Technical(String idBook, String authorOfBook, String nameOfBook, String date, String name) {
        super(idBook, authorOfBook, nameOfBook, date);
        this.name = name;
    }

    public Technical(Book[][] test, String name) {
        super(test);
        this.name = name;
    }

    public int getComputer() {
        return computer;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public boolean withComputer() {
        return computer > 0;
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
