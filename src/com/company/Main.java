package com.company;

public class Main {

    public static void main(String[] args) {
        Circle[] circle = new Circle[10];
        int count = 0;
        for (int i = 0; i < circle.length; i++){
            circle[i] = Circle.getGenerateCircle();
            if (i % 3 == 0) {
                count++;
                System.out.print(i + " ");
            }
        }
        System.out.printf("\n%s", count);
    }
}
