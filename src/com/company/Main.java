package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            array.add(i);
        }
        System.out.println(array);
        Set<Integer> hashSet = new HashSet<>(array);
        for (Iterator<Integer> it = hashSet.iterator(); it.hasNext();){

        }
    }
}
