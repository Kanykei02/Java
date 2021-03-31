package com.company;

public class Student implements testable{
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void takethetest() {
        System.out.println("Student " + name + "is being testing");
    }
}
