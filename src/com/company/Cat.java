package com.company;

public class Cat extends AbstractCatlike {
    @Override
    public String toString(){
        return "I am a cat. " + "Claws number: " + getClawsNumber()
                + ", Tail length: " + getTailLength()
                + ", Mustache length: " + getMustacheLenght();
    }

    @Override
    public void makeNoise(){
        System.out.println("Meow-meow");
    }

    @Override
    public  void purr(){
        System.out.println("Cat is purring");
    }

    @Override
    public  void sharpenClaws(){
        System.out.println("Cat is sharpenins it's claws");
    }

    @Override
    public  void landOnPaws(){
        System.out.println("Cat is landing on paws");
    }
}
