package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
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

        num.stream().map(x -> x * 2).map(x -> x - 1).forEach(x -> System.out.println(x));

        List<Integer> procent = Arrays.asList(123, 1341234, 26736, 62356);
        procent.stream().map(x -> x / 100).map(x -> x * 10).forEach(System.out::println);//можно просто умножить на 0,1)) ну ты клоун Каныкей

        List<String> str = Arrays.asList("Olya", "Yulya");
        str.stream().forEach(x -> System.out.println(x + x));

        List<Student> students = Arrays.asList(new Student("Alex", 1));
        students.stream().map(x -> x.getName()).forEach(x -> System.out.println(x));

        List<String> stringList1 = students.stream().map(x -> x.getName()).collect(Collectors.toList());
        System.out.println(stringList1);

         
    }
}
