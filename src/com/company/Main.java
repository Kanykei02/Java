package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Multiple> multiples = new ArrayList<>();
        Multiple m1 = new Multiple(10, 10);
        Multiple m2 = new Multiple(3, 10);
        Multiple m3 = new Multiple(25, 5);

        fillListWithUniqueMults(multiples, m1);
        fillListWithUniqueMults(multiples, m2);
        fillListWithUniqueMults(multiples, m3);

        System.out.println(multiples);

        Cat cat1 = new Cat("Dean", 3);
        Cat cat2 = new Cat("Cas", 2);
        System.out.println(cat1.getName() + ": " + cat1.hashCode());
        System.out.println(cat2.getName() + ": " + cat2.hashCode());

        List<Cat> cats = new ArrayList<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(new Cat("Sam", 3));

        for (int i = 0; i < cats.size(); i++) {
            for (int j = i + 1; j < cats.size(); j++) {
                if (cats.get(i).equals(cats.get(j))) {
                    System.out.println("Similar cats");
                    break;
                }
            }
        }

        for (Cat cat : cats) {
            System.out.println(cat.hashCode());
        }

        List<Integer> duplList = new ArrayList<>();
        int duplSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 100; j++) {
                duplList.add(j);
                duplSum += j;
            }
        }
        System.out.println(duplList);
        System.out.println("DuplList sum: " + duplSum);

        Set<Integer> hashSet = new HashSet<>(duplList);
        int hashSetSum = 0;
        for (Iterator<Integer> it = hashSet.iterator(); it.hasNext();){
            Integer item = it.next();
            hashSetSum += item;
            System.out.println(item);
        }
        System.out.println("Hash set sum: " + hashSetSum);

        Cat cat3 = new Cat("Crowly", 1);
        Cat cat4 = new Cat("Rowena", 3);

        Set<Cat> catsHash = new HashSet<>();
        catsHash.add(cat1);
        catsHash.add(cat2);
        catsHash.add(cat3);
        catsHash.add(cat4);

        System.out.println("Cats size " + catsHash.size());

        catsHash.add(cat1);
        catsHash.add(new Cat("Rowena", 3));

        System.out.println("Cats new size " + catsHash.size());
    }

    public static boolean fillListWithUniqueMults(List<Multiple> list, Multiple multi) {
        if (list.contains(multi))
            return false;
        list.add(multi);
        return true;
    }
}
