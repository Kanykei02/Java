package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Alex", "Sam"};
        Stream.of(names).forEach(x -> System.out.println(x));

        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.stream().forEach(numm -> System.out.println(numm));

        Stream.Builder<String> stringSBuilder = Stream.builder();
//        stringSBuilder.accept("Max");
//        stringSBuilder.accept("GF");
//        stringSBuilder.accept("sdjh");

        Stream<String> stringStream = stringSBuilder.add("Max").add("GKyg").build();

        Integer[] numb = {1, 2, 3, 4};
        Stream.of(numb).forEach(a -> System.out.println(a*a));

        List<String> stringList = Arrays.asList("Alex", "Sam");
        stringList.forEach(x -> System.out.println(x.replace("a", "o")));


    }
}
