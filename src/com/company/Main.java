package com.company;

public class Main {

    public static void main(String[] args) {
        Swimmable[] oceanarrium = new Swimmable[15];
        for (int i = 0; i < oceanarrium.length; i++){
            if (i < 5) oceanarrium[i] = new Turtle();
            else if (i < 10) oceanarrium[i] = new Shark();
            else oceanarrium[i] = new Duck();

            oceanarrium[i].makeSound();
        }
    }
}
