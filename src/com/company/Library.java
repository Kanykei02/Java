package com.company;

public class Library extends Book{
    static int n = 1;
    static Book[][] test = new Book[4][n];

    public Library() {}

    public Library(String idBook, String authorOfBook, String nameOfBook, String date) {
        super(idBook, authorOfBook, nameOfBook, date);
    }



    public Library(Book[][] test){
        Library.test = test;
    }

    public static void addBooks(Book book, int library){
        System.out.println(book);
        test[library][n-1] = book;
        n++;
    }

    public static void search(String name, int p) {
        for(int i = 0; i < test[p].length; i++){
            if (name.equals(test[p][i].nameOfBook)){
                System.out.println("Нашлось");
            }
        }
    }
}

