package com.company;

public class Turtle implements Turtlable{
    @Override
    public void swim(){
        System.out.println("Я умею плавать!");
    }
    @Override
    public void shell(){
        System.out.println("Я ношу панцирь!");
    }
    @Override
    public void put(){
        System.out.println("Я могу откладывать яйца!");
    }
}
