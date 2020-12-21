package com.company;

public class Cow extends AbstractAnimal {
    @Override
    public String toString(){
        return "I am a cow. " + "Weight: " + getWeight()
                + ", Age is " + getAge() + ", Color is " + getColor();
    }

    @Override
    public void makeNoise(){
        System.out.println("Moo-moo");
    }

    @Override
    public void eat(){
        System.out.println("Cow is eating ");
    }

    @Override
    public void sleep(){
        System.out.println("Cow is sleeping");
    }
}
