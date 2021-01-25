package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cat extends Animal{
    public Cat(String name, Integer age) {
        super(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj instanceof Cat)
        return  (((Cat)obj).getName().equals(this.getName()) &&
                ((Cat)obj).getAge() == this.getAge());
        return false;
    }

//    public static boolean find(List<Cat> cats, Cat findCat) {
//        for (Cat cat : cats){
//            if (cat.equals(findCat)){
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean find(List<Cat> cats) {
        for (Cat cat : cats){
            if (cat.equals(this)){
                return true;
            }
        }
        return false;
    }

    public static List<Cat> generateCats(String[] names, int size){
        List<Cat> cats = new ArrayList<>();
        //Random r = new Random();
        if (size <= names.length) {
            for (int i = 1; i <= size; i++) {
                cats.add(new Cat(names[i - 1], i));
            }
        }
        else return null;
        return cats;
    }
}
