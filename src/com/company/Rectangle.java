package com.company;

import java.awt.*;

public class Rectangle extends Shape{
    private int height;
    private int width;
    private static int count;

    public Rectangle(Coordinates coordinates, Color color, boolean inVisible, int height, int width) {
        super(coordinates, color, inVisible);
        this.height = height;
        this.width = width;
        count++;
    }

    public Rectangle(Coordinates coordinates, Color color, boolean inVisible, int side) {
        super(coordinates, color, inVisible);
        this.height = side;
        this.width = side;
        count++;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String speak() {
        String result = super.speak();
        if(height == width) result += "\nSide:" + height;
        else result += " \nHeight: " + height +
                "\nWidth: " + width;
        return result;
    }

    public static int getCount() {
        return count;
    }
}
