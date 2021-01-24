package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(10);
        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println("List size: " + list.size());
        List<Integer> sqrs = new ArrayList<>();
        int max = 10000;
        double maxSqrs = Math.sqrt(max);
        for(int i = 1; i <= maxSqrs; i++){
            sqrs.add(i*i);
        }
        System.out.println(sqrs);

        System.out.println("Task2 ----------------------------------");
        List<Integer> sortedList = new ArrayList<>();
        int maxBound = 100;
        for (int i = 1; i <= maxBound; i++){
            if (i % 2 != 0){
                sortedList.add(0, i);
            } else {
                sortedList.add(i);
            }
        }
        System.out.println(sortedList);

        System.out.println("Task3 ----------------------------------");
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < sqrs.size(); i++){
            int currentEl = sqrs.get(i);
            if(currentEl % 2 == 0 || currentEl % 3 == 0){
                newList.add(i);
            }
        }
        System.out.println(newList);

        System.out.println("Task4 ----------------------------------");
        for (int i = 0; i < sortedList.size(); i++){
            if (sortedList.get(i) % 2 == 0){
                sortedList.remove(i--);
                //i--;
            }
        }
        System.out.println(sortedList);

        System.out.println("Task----------------------------------");
        Integer[] ints = sortedList.toArray(new Integer[sortedList.size()]);
        for (Integer i : ints){
            System.out.print(i + ", ");
        }
        List<Integer> arr = Arrays.asList(ints);
    }
}
