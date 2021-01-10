package com.company;

public class Main {

    public static void main(String[] args) {
        final int[] array = new int[10];
        for(int i = 0; i < array.length; i++){
            array[i] = i;
            array[i] = i + 5;
            System.out.print(array[i] + " ");
        }
    }
}
