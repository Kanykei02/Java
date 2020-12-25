package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle[] circle = new Circle[10];
        int count = 0;

        for (int i = 0; i < circle.length; i++){
            circle[i] = new Circle();
            circle[i] = Circle.getGenerateCircle();
            System.out.println(circle[i].getCircleArea());
            if (circle[i].getCircleArea() % 3 == 0) {
                count++;
            }
        }
        System.out.printf("%s", count);
    }
}
