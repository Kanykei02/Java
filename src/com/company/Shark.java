package com.company;

public class Shark implements Swimmable{
    @Override
    public void swim() {
        System.out.println("Shark is swimming with flippers.");
    }
    @Override
    public void makeSound() {
        System.out.println("Shark is silent.");
    }
    public void hunt() {
        System.out.println("I'm hunting");
    }
}
