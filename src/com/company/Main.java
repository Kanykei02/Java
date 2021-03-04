package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter news Headline: ");
        News news = new News();
        news.setNewsHeadline(sc.nextLine());
        System.out.print("Enter news text: ");
        news.setNewsText(sc.nextLine());

        redactor(news);
    }
    public static void redactor(News news){
        if(DataBase.addNews(news)){
            System.out.println("Good!");
        }
        else {
            System.out.println("Something went wrong!");
        }
    }
}
