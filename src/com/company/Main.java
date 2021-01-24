package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Dean", "Cas", "Sam", "Crowly", "Rowena"};
        List<Cat> cats = new ArrayList<>();
        Random r = new Random();
        for (int i = 1; i <= names.length; i++){
            cats.add(new Cat(names[i - 1], i));
        }
        System.out.println(cats);
        Cat findCat = new Cat("Dean", 1);
        for (Cat cat : cats){
            if (cat.equals(findCat)){
                System.out.println("Found the cat");
                break;
            }
        }
    }
}
