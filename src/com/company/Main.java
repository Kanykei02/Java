package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Dean", "Cas", "Sam", "Crowly", "Rowena"};
//        List<Cat> cats = new ArrayList<>();
//        Random r = new Random();
//        for (int i = 1; i <= names.length; i++){
//            cats.add(new Cat(names[i - 1], i));
//        }
        List<Cat> cats = Cat.generateCats(names, 5);
        System.out.println(cats);
        Cat findCat = new Cat("Cas", 2);
//        for (Cat cat : cats){
//            if (cat.equals(findCat)){
//                System.out.println("Found the cat");
//                break;
//            }
//        }
        //Cat.find(cats, findCat);
        System.out.println("Found cat: " + findCat.find(cats));

        Cat[] catArray = cats.toArray(new Cat[cats.size()]);

        List<Animal> animalsList = new LinkedList<>();
        for (int i = 1; i <= 50; i++){
            animalsList.add(new Cat("Cat", i));
            animalsList.add(new Dog("Dog", i));
        }
        System.out.println(animalsList);
        int catCount = 0, dogCount = 0;
        for (int i = 0; i < animalsList.size(); i++){
            if (animalsList.get(i) instanceof Cat){
                catCount++;
                if (catCount % 5 == 0){
                    animalsList.remove(i);
                    i--;
                }
            }
            else if (animalsList.get(i) instanceof Dog) {
                dogCount++;
                if (dogCount % 3 == 0){
                    animalsList.add(i, new Mouse("Mouse", i));
                    Animal tmp = animalsList.get(i);
                    animalsList.set(i, animalsList.get(i + 1));
                    animalsList.set(i + 1, tmp);
                }
            }
        }
        System.out.println(animalsList);
    }
}
