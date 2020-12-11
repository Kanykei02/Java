package com.company;

public class Student {
    String name;
    int age;
    double rate;

    public Student() {}

    public Student(String name, int age, double rate) {
        this.name = name;
        this.age = age;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
