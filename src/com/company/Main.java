package com.company;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        List<Person> list = new LinkedList<>();
        Person p1 = new Person("Win", "Castiel", "Winchester");
        Person p2 = new Person("Win", "Dean", "Winchester");
        Person p3 = new Person("Win", "Sam", "Winchester");

        hasSimilar(list, p1);
        hasSimilar(list, p2);
        hasSimilar(list, p3);

        System.out.println(list);

    }
    public static void hasSimilar(List<Person> people, Person person) throws Exception{
        if (people.contains(person)) {
            throw new Exception();
        }
        people.add(person);
    }
}
