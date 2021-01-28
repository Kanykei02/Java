package com.company;

public interface Flat {
    default void flat(){
        System.out.println("Flat");
    }
}
