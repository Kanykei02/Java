package com.company;

public class Tiger extends AbstractCatlike {
    @Override
    public String toString() {
        return "I am a tiger. " + "Claws number: " + getClawsNumber()
                + ", Tail length: " + getTailLength()
                + ", Mustache length: " + getMustacheLenght();
    }

    @Override
    public void makeNoise(){
        System.out.println("Raw-raw");
    }

    @Override
    public  void purr(){
        System.out.println("Tiger is purring");
    }

    @Override
    public  void sharpenClaws(){
        System.out.println("Tiger is sharpenins it's claws");
    }

    @Override
    public  void landOnPaws(){
        System.out.println("Tiger is landing on paws");
    }
}
