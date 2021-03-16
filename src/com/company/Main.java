package com.company;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(50);
        set.add(1);
        set.add(2);
        System.out.println(set);

//        Set<String> set1 = new TreeSet<>();
//        set1.add("Castiel");
//        set1.add("Sam");
//        set1.add("Dean ");
//        System.out.println(set1);

        TreeSet<String> months = new TreeSet<>();
        months.add("JanuRY");
        months.add("FEBRUARY");
        months.add("MARCH");
        months.add("APRIL");
        System.out.println(months.contains("MARCH"));
        months.remove("FEBRUARY");

        System.out.println(months.first());
        System.out.println(months.last());

        months.add("JanuRY");
        System.out.println(months);

        TreeSet<Character> set1 = new TreeSet<>();
        TreeSet<Character> set2 = new TreeSet<>();

        set1.add('a');
        set1.add('b');
        set1.add('c');
        set1.add('d');
        set1.add('e');

        set2.add('a');
        set2.add('b');
        set2.add('c');
        set2.add('f');
        set2.add('g');

        for (Character ch: set2){
            if (set1.contains(ch)){
                set1.add(ch);
            }
        }

        Iterator<Character> it = set1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        Iterator<Character> it2 = set2.descendingIterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
    }
}
