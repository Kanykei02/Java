package com.company;

public class Bread {
    private static int numberOfBreads;

    public Bread() {
        numberOfBreads++;
    }

    public static int getNumberOfBreads(){
        return numberOfBreads;
    }
}
