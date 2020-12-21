package com.company;

public abstract class AbstractAnimal {
    private int weight;
    private int age;
    private String color;

    public AbstractAnimal() {}
    public AbstractAnimal(int weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public abstract void makeNoise();

    public abstract void eat();

    public abstract void sleep();

    public void relax(){
        eat();
        sleep();
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
