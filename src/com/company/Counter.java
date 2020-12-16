package com.company;

public class Counter {
    private static int numOfCalls;

    public static void increment() {
        numOfCalls++;
    }

    public int factorial(){
        int fact = 1;
        if(numOfCalls == 0) return 1;
        else{
            for (int i = numOfCalls; i > 1; i--) {
                fact *= i;
            }
            return fact;
        }
    }
}
