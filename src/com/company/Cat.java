package com.company;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Cat) {
            Cat cat = (Cat)obj;
            return cat.getName().equals(this.getName()) ||
                    cat.getAge() == this.getAge();
        }
        return false;
    }

    @Override
    public int hashCode() {
        return age * 29;
    }
}
