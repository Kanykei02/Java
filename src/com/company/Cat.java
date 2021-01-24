package com.company;

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
        return name + ": " + age;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        else if (obj instanceof Cat)
        return  (((Cat)obj).getName().equals(this.name) &&
                ((Cat)obj).getAge() == this.age);
        return false;
    }
}
