package com.company;

import java.util.Random;

public class Circle {
    double radius;
    final double pi = 3.14;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return pi * getRadius() * 2;
    }

    public static Circle getGenerateCircle() {
        Random rand = new Random();
        int randomRadius = rand.nextInt(11);
        return new Circle(randomRadius);
    }
}
