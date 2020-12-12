package com.company.library;

public class ApiUser {
    public static void main(String[] args) {
        Book book = new Book();
        book.setGiftedBy("Sam");
        System.out.println("Gifted by " + book.getGiftedBy());
    }
}
