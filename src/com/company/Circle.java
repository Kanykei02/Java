package com.company;

import java.awt.*;

public class Circle {
    private double radius;
    private Color color;
    private int x;
    private int y;

    public Circle() {}

    public Circle(double radius, Color color, int x, int y) {
        this.radius = radius;
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getCircleArea() {
        return Math.PI * getRadius() * getRadius();
    }

    public double getCircleLength() {
        return 2 * Math.PI * getRadius();
    }
}
