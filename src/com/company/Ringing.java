package com.company;

public interface Ringing {
    default void ringing(){
        System.out.println("Ringing");
    }
}
