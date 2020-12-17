package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Book testBook = new Book("id", "author", "name", "date");
        Technical.add(testBook);
        System.out.println(Library.test[1][0].getNameOfBook());

        Artistic artistic = new Artistic("id", "author", "М", "date", "Artistic");
        System.out.println(artistic);

        Library.search("name", 1);

        Legal legal = new Legal("id", "author", "М", "date", "Artistic");
        System.out.println(legal);

        Technical technical = new Technical("id", "author", "М", "date", "Artistic");
        technical.withComputer();
        System.out.println(technical);



    }
}
