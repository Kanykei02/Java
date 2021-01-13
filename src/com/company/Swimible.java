package com.company;

public interface Swimible {
    boolean IS_SWIMMING = true;
    int MAX_OCEAN_DEPTH = 11000;

    default void swimming(){
        System.out.println("Swimming");
    }
}
